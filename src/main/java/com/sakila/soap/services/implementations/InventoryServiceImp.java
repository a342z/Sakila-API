package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.InventoryMapper;
import com.sakila.models.dtos.InventoryDto;
import com.sakila.models.entities.Inventory;
import com.sakila.repositories.implementations.InventoryRepositoryImp;
import com.sakila.repositories.interfaces.InventoryRepository;
import jakarta.jws.WebService;

@WebService
public class InventoryServiceImp  {

    InventoryRepository repository ;
    InventoryMapper mapper;

    public InventoryServiceImp() {
        mapper = InventoryMapper.INSTANCE;
        repository = new InventoryRepositoryImp();
    }

    public List<InventoryDto> getAll() {
        List<InventoryDto> dtos = new ArrayList<>();
        for (Inventory entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public InventoryDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public InventoryDto add(InventoryDto dto) {
        Inventory entity = mapper.toEntity(dto);
        Inventory savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, InventoryDto dto) {
        Inventory entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }



   
}
