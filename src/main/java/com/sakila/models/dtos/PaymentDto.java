package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Payment} entity
 */
@Data
public class PaymentDto implements Serializable,Identifiable {
    private Integer id;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private CustomerDto customer;
    private RentalDto rental;
    @NotNull
    private StaffDto staff;
    private Instant lastUpdate= Instant.now();
    @NotNull
    private Instant paymentDate;
}