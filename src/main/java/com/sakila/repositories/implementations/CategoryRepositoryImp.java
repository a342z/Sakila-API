package com.sakila.repositories.implementations;

import com.sakila.models.entities.Category;
import com.sakila.repositories.interfaces.CategoryRepository;
import com.sakila.utils.EntityManagerUtil;

public class CategoryRepositoryImp extends CrudRepositoryImp<Category> implements CategoryRepository {

    public CategoryRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Category.class);
    }

}
