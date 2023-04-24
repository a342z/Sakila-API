package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.FilmMapper;
import com.sakila.models.dtos.FilmDto;
import com.sakila.models.entities.Film;
import com.sakila.repositories.implementations.FilmRepositoryImp;
import com.sakila.repositories.interfaces.FilmRepository;
import jakarta.jws.WebService;

@WebService
public class FilmServiceImp{
    
    FilmRepository repository ;
    FilmMapper mapper;

    public FilmServiceImp() {
        mapper = FilmMapper.INSTANCE;
        repository = new FilmRepositoryImp();
    }

    public List<FilmDto> getAll() {
        List<FilmDto> dtos = new ArrayList<>();
        for (Film entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    public FilmDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    public FilmDto add(FilmDto dto) {
        Film entity = mapper.toEntity(dto);
        Film savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    public void update(int id, FilmDto dto) {
        Film entity = mapper.toEntity(dto);
        repository.update(entity);
    }
    
    public void delete(int id) {
        repository.delete(id);
    }

}

