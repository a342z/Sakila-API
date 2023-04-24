package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.LanguageMapper;
import com.sakila.models.dtos.LanguageDto;
import com.sakila.models.entities.Language;
import com.sakila.repositories.implementations.LanguageRepositoryImp;
import com.sakila.repositories.interfaces.LanguageRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class LanguageServiceImp   {

    LanguageRepository repository ;
    LanguageMapper mapper;

    public LanguageServiceImp() {
        mapper = LanguageMapper.INSTANCE;
        repository = new LanguageRepositoryImp();
    }
    
    public List<LanguageDto> getAll() {
        List<LanguageDto> dtos = new ArrayList<>();
        for (Language entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public LanguageDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public LanguageDto add(LanguageDto dto) {
        Language entity = mapper.toEntity(dto);
        Language savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, LanguageDto dto) {
        Language entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }



}
