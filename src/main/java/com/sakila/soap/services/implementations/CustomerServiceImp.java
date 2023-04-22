package com.sakila.soap.services.implementations;

import com.sakila.mappers.CustomerMapper;
import com.sakila.models.dtos.CustomerDto;
import com.sakila.models.entities.Customer;
import com.sakila.repositories.implementations.CustomerRepositoryImp;
import com.sakila.soap.services.interfaces.CustomerService;
import jakarta.jws.WebService;


public class CustomerServiceImp extends CrudServiceImp<Customer, CustomerDto> implements CustomerService {

    public CustomerServiceImp() {
        super(new CustomerRepositoryImp(), CustomerMapper.INSTANCE);
    }

   
}
