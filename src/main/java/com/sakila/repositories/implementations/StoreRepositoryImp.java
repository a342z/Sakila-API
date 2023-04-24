package com.sakila.repositories.implementations;

import com.sakila.models.entities.Store;
import com.sakila.repositories.interfaces.StoreRepository;
import com.sakila.utils.EntityManagerUtil;

public class StoreRepositoryImp extends CrudRepositoryImp<Store> implements StoreRepository {

    public StoreRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Store.class);
    }

}
