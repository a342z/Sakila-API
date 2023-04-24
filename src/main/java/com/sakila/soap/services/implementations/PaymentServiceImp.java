package com.sakila.soap.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.PaymentMapper;
import com.sakila.models.dtos.PaymentDto;
import com.sakila.models.entities.Payment;
import com.sakila.repositories.implementations.PaymentRepositoryImp;
import com.sakila.repositories.interfaces.PaymentRepository;
import jakarta.jws.WebService;

@WebService
public class PaymentServiceImp {

    PaymentRepository repository ;
    PaymentMapper mapper;

    public PaymentServiceImp() {
        mapper = PaymentMapper.INSTANCE;
        repository = new PaymentRepositoryImp();
    }

    public List<PaymentDto> getAll() {
        List<PaymentDto> dtos = new ArrayList<>();
        for (Payment entity : repository.getAll()) {
            dtos.add(mapper.toDto(entity));
        }
        return dtos;
    }
    
    
    public PaymentDto getById(int id) {
        System.out.println(mapper.toDto(repository.getById(id)));
        return mapper.toDto(repository.getById(id));
    }

    
    public PaymentDto add(PaymentDto dto) {
        Payment entity = mapper.toEntity(dto);
        Payment savedEntity = repository.add(entity);
        return mapper.toDto(savedEntity);
    }

    
    public void update(int id, PaymentDto dto) {
        Payment entity = mapper.toEntity(dto);
        repository.update(entity);
    }

    
    public void delete(int id) {
        repository.delete(id);
    }



   
}
