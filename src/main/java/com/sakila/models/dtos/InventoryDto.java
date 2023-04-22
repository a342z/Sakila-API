package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Inventory} entity
 */
@Data
public class InventoryDto implements Serializable,Identifiable  {
    private Integer id;
    @NotNull
    private FilmDto film;
    @NotNull
    private StoreDto store;
    @NotNull
    private Instant lastUpdate= Instant.now();
}