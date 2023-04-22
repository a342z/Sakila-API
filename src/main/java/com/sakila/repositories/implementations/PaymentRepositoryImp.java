package com.sakila.repositories.implementations;

import com.sakila.models.entities.Payment;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.interfaces.PaymentRepository;
import com.sakila.repositories.interfaces.StaffRepository;
import com.sakila.utils.EntityManagerUtil;

public class PaymentRepositoryImp extends CrudRepositoryImp<Payment> implements PaymentRepository {

    public PaymentRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Payment.class);
    }

}
