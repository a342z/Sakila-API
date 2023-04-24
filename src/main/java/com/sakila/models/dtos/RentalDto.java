package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Rental} entity
 */
@XmlRootElement(name="rental")
@Data
@AllArgsConstructor
@NoArgsConstructor
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