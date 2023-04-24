package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.CustomerMapper;
import com.sakila.models.dtos.CustomerDto;
import com.sakila.models.entities.Customer;
import com.sakila.repositories.implementations.CustomerRepositoryImp;
import com.sakila.repositories.interfaces.CustomerRepository;
import jakarta.jws.WebService;

@WebService
public class CustomerServiceImp  {

    CustomerRepository repository ;
    CustomerMapper mapper;

    public CustomerServiceImp() {
        mapper = CustomerMapper.INSTANCE;
        repository = new CustomerRepositoryImp();
    }

    public List<CustomerDto> getAll() {
        List<CustomerDto> dtos = new ArrayList<>();
        for (Customer entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public CustomerDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public CustomerDto add(CustomerDto dto) {
        Customer entity = mapper.toEntity(dto);
        Customer savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, CustomerDto dto) {
        Customer entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }


   
}
