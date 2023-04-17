package com.sakila.services.implementations;

import com.sakila.mappers.CategoryMapper;
import com.sakila.models.dtos.CategoryDto;
import com.sakila.models.entities.Category;
import com.sakila.repositories.implementations.CategoryRepositoryImp;
import com.sakila.repositories.interfaces.CrudRepository;
import com.sakila.services.interfaces.CategoryService;

public class CategoryServiceImp  extends CrudServiceImp<Category,CategoryDto> implements CategoryService{

    public CategoryServiceImp() {
        super(new CategoryRepositoryImp(), CategoryMapper.INSTANCE);
    }


}
