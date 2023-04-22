package com.sakila.repositories.implementations;

import com.sakila.models.entities.Customer;
import com.sakila.models.entities.Store;
import com.sakila.repositories.interfaces.CustomerRepository;
import com.sakila.repositories.interfaces.StoreRepository;
import com.sakila.utils.EntityManagerUtil;

public class CustomerRepositoryImp extends CrudRepositoryImp<Customer> implements CustomerRepository {

    public CustomerRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Customer.class);
    }

}
