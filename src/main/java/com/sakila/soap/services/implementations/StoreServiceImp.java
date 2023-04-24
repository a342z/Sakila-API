package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.StoreMapper;
import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Store;
import com.sakila.repositories.implementations.StoreRepositoryImp;
import com.sakila.repositories.interfaces.StoreRepository;
import jakarta.jws.WebService;

@WebService
public class StoreServiceImp {

 
    StoreRepository repository ;
    StoreMapper mapper;

    public StoreServiceImp() {
        mapper = StoreMapper.INSTANCE;
        repository = new StoreRepositoryImp();
    }

    public List<StoreDto> getAll() {
        List<StoreDto> dtos = new ArrayList<>();
        for (Store entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public StoreDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public StoreDto add(StoreDto dto) {
        Store entity = mapper.toEntity(dto);
        Store savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, StoreDto dto) {
        Store entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }



   
}
