package com.sakila.services.implementations;

import com.sakila.mappers.CustomerMapper;
import com.sakila.mappers.StoreMapper;
import com.sakila.models.dtos.CustomerDto;
import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Customer;
import com.sakila.models.entities.Store;
import com.sakila.repositories.implementations.CustomerRepositoryImp;
import com.sakila.repositories.implementations.StoreRepositoryImp;
import com.sakila.services.interfaces.CustomerService;
import com.sakila.services.interfaces.StoreService;

public class CustomerServiceImp extends CrudServiceImp<Customer, CustomerDto> implements CustomerService {

    public CustomerServiceImp() {
        super(new CustomerRepositoryImp(), CustomerMapper.INSTANCE);
    }

   
}
