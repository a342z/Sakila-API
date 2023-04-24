package com.sakila.services.implementations;

import com.sakila.mappers.PaymentMapper;
import com.sakila.mappers.StaffMapper;
import com.sakila.models.dtos.PaymentDto;
import com.sakila.models.dtos.StaffDto;
import com.sakila.models.entities.Payment;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.implementations.PaymentRepositoryImp;
import com.sakila.repositories.implementations.StaffRepositoryImp;
import com.sakila.services.interfaces.PaymentService;
import com.sakila.services.interfaces.StaffService;

public class PaymentServiceImp extends CrudServiceImp<Payment, PaymentDto> implements PaymentService {

    public PaymentServiceImp() {
        super(new PaymentRepositoryImp(), PaymentMapper.INSTANCE);
    }

   
}
