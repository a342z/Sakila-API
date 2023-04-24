package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.RentalMapper;
import com.sakila.models.dtos.RentalDto;
import com.sakila.models.entities.Rental;
import com.sakila.repositories.implementations.RentalRepositoryImp;
import com.sakila.repositories.interfaces.RentalRepository;
import jakarta.jws.WebService;

@WebService
public class RentalServiceImp  {


    RentalRepository repository ;
    RentalMapper mapper;

    public RentalServiceImp() {
        mapper = RentalMapper.INSTANCE;
        repository = new RentalRepositoryImp();
    }

    public List<RentalDto> getAll() {
        List<RentalDto> dtos = new ArrayList<>();
        for (Rental entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public RentalDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public RentalDto add(RentalDto dto) {
        Rental entity = mapper.toEntity(dto);
        Rental savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, RentalDto dto) {
        Rental entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }


   
}
