package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Store} entity
 */
@Data
public class StoreDto implements Serializable,Identifiable {
    private Short id;
    @NotNull
    private StaffDto managerStaff;
    @NotNull
    private AddressDto address;
    @NotNull
    private Instant lastUpdate = Instant.now();
}