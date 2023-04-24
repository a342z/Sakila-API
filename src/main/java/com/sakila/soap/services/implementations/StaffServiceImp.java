package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.StaffMapper;
import com.sakila.models.dtos.StaffDto;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.implementations.StaffRepositoryImp;
import com.sakila.repositories.interfaces.StaffRepository;
import jakarta.jws.WebService;

@WebService
public class StaffServiceImp {
    StaffRepository repository ;
    StaffMapper mapper;

    public StaffServiceImp() {
        mapper = StaffMapper.INSTANCE;
        repository = new StaffRepositoryImp();
    }

    public List<StaffDto> getAll() {
        List<StaffDto> dtos = new ArrayList<>();
        for (Staff entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public StaffDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public StaffDto add(StaffDto dto) {
        Staff entity = mapper.toEntity(dto);
        Staff savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, StaffDto dto) {
        Staff entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }


   
}
