package com.sakila.repositories.implementations;

import com.sakila.models.entities.Inventory;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.interfaces.InventoryRepository;
import com.sakila.repositories.interfaces.StaffRepository;
import com.sakila.utils.EntityManagerUtil;

public class InventoryRepositoryImp extends CrudRepositoryImp<Inventory> implements InventoryRepository {

    public InventoryRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Inventory.class);
    }

}
