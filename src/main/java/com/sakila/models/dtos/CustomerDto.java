package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Customer} entity
 */
@Data
public class CustomerDto implements Serializable,Identifiable  {
    private Integer id;
    @NotNull
    private StoreDto store;
    @Size(max = 45)
    @NotNull
    private String firstName;
    @Size(max = 45)
    @NotNull
    private String lastName;
    @Size(max = 50)
    private String email;
    @NotNull
    private AddressDto address;
    @NotNull
    private Boolean active;
    @NotNull
    private Instant createDate;
    private Instant lastUpdate= Instant.now();
}