package com.sakila.services.implementations;

import com.sakila.mappers.InventoryMapper;
import com.sakila.mappers.StoreMapper;
import com.sakila.models.dtos.InventoryDto;
import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Inventory;
import com.sakila.models.entities.Store;
import com.sakila.repositories.implementations.InventoryRepositoryImp;
import com.sakila.repositories.implementations.StoreRepositoryImp;
import com.sakila.services.interfaces.InventoryService;
import com.sakila.services.interfaces.StoreService;

public class InventoryServiceImp extends CrudServiceImp<Inventory, InventoryDto> implements InventoryService {

    public InventoryServiceImp() {
        super(new InventoryRepositoryImp(), InventoryMapper.INSTANCE);
    }

   
}
