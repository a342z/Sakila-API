package com.sakila.services.implementations;

import com.sakila.mappers.ActorMapper;
import com.sakila.mappers.StoreMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Actor;
import com.sakila.models.entities.Store;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.repositories.implementations.StoreRepositoryImp;
import com.sakila.services.interfaces.ActorService;
import com.sakila.services.interfaces.StoreService;

public class StoreServiceImp extends CrudServiceImp<Store, StoreDto> implements StoreService {

    public StoreServiceImp() {
        super(new StoreRepositoryImp(), StoreMapper.INSTANCE);
    }

   
}
