package com.sakila.soap.services.implementations;

import com.sakila.mappers.StoreMapper;
import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Store;
import com.sakila.repositories.implementations.StoreRepositoryImp;
import com.sakila.soap.services.interfaces.StoreService;
import jakarta.jws.WebService;


public class StoreServiceImp extends CrudServiceImp<Store, StoreDto> implements StoreService {

    public StoreServiceImp() {
        super(new StoreRepositoryImp(), StoreMapper.INSTANCE);
    }

   
}
