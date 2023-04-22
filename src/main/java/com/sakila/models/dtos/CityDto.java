package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.City} entity
 */
@Data
public class CityDto implements Serializable,Identifiable {
    private Integer id;
    @Size(max = 50)
    @NotNull
    private String city;
    @NotNull
    private CountryDto country;
    @NotNull
    private Instant lastUpdate= Instant.now();
}