package com.sakila.soap.services.implementations;

import com.sakila.mappers.CategoryMapper;
import com.sakila.models.dtos.CategoryDto;
import com.sakila.models.entities.Category;
import com.sakila.repositories.implementations.CategoryRepositoryImp;
import com.sakila.soap.services.interfaces.CategoryService;
import jakarta.jws.WebService;


public class CategoryServiceImp  extends CrudServiceImp<Category,CategoryDto> implements CategoryService {

    public CategoryServiceImp() {
        super(new CategoryRepositoryImp(), CategoryMapper.INSTANCE);
    }


}
