package com.sakila.soap.services.implementations;

import com.sakila.mappers.PaymentMapper;
import com.sakila.models.dtos.PaymentDto;
import com.sakila.models.entities.Payment;
import com.sakila.repositories.implementations.PaymentRepositoryImp;
import com.sakila.soap.services.interfaces.PaymentService;
import jakarta.jws.WebService;


public class PaymentServiceImp extends CrudServiceImp<Payment, PaymentDto> implements PaymentService {

    public PaymentServiceImp() {
        super(new PaymentRepositoryImp(), PaymentMapper.INSTANCE);
    }

   
}
