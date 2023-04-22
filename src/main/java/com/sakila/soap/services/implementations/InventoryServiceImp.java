package com.sakila.soap.services.implementations;

import com.sakila.mappers.InventoryMapper;
import com.sakila.models.dtos.InventoryDto;
import com.sakila.models.entities.Inventory;
import com.sakila.repositories.implementations.InventoryRepositoryImp;
import com.sakila.soap.services.interfaces.InventoryService;
import jakarta.jws.WebService;


public class InventoryServiceImp extends CrudServiceImp<Inventory, InventoryDto> implements InventoryService {

    public InventoryServiceImp() {
        super(new InventoryRepositoryImp(), InventoryMapper.INSTANCE);
    }

   
}
