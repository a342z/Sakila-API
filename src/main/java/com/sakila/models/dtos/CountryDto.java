package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Country} entity
 */
@Data
public class CountryDto implements Serializable,Identifiable {
    private Integer id;
    @Size(max = 50)
    @NotNull
    private String country;
    @NotNull
    private Instant lastUpdate= Instant.now();
}