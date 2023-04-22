package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Rental} entity
 */
@Data
public class RentalDto implements Serializable,Identifiable {
    private Integer id;
    @NotNull
    private CustomerDto customer;
    @NotNull
    private Integer inventoryId;
    @NotNull
    private StaffDto staff;
    @NotNull
    private Instant lastUpdate = Instant.now();
    @NotNull
    private Instant rentalDate;
    private Instant returnDate;
}