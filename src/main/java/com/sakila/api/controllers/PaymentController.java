package com.sakila.api.controllers;

import com.sakila.models.dtos.PaymentDto;
import com.sakila.services.implementations.PaymentServiceImp;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("payments")
@Produces(MediaType.APPLICATION_JSON)
public class PaymentController extends ResourceController<PaymentDto> {
    public PaymentController() {
        super(new PaymentServiceImp());
    }
}
