package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.CategoryMapper;
import com.sakila.models.dtos.CategoryDto;
import com.sakila.models.entities.Category;
import com.sakila.repositories.implementations.CategoryRepositoryImp;
import com.sakila.repositories.interfaces.CategoryRepository;
import jakarta.jws.WebService;

@WebService
public class CategoryServiceImp {
     
    CategoryRepository repository ;
    CategoryMapper mapper;

    public CategoryServiceImp() {
        mapper = CategoryMapper.INSTANCE;
        repository = new CategoryRepositoryImp();
    }

    public List<CategoryDto> getAll() {
        List<CategoryDto> dtos = new ArrayList<>();
        for (Category entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    public CategoryDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    public CategoryDto add(CategoryDto dto) {
        Category entity = mapper.toEntity(dto);
        Category savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    public void update(int id, CategoryDto dto) {
        Category entity = mapper.toEntity(dto);
        repository.update(entity);
    }
    
    public void delete(int id) {
        repository.delete(id);
    }

}
