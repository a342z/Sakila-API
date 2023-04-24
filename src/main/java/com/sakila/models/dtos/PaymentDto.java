package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Payment} entity
 */
@XmlRootElement(name="payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
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