package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Inventory} entity
 */
@XmlRootElement(name="inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto implements Serializable,Identifiable  {
    private Integer id;
    @NotNull
    private FilmDto film;
    @NotNull
    private StoreDto store;
    @NotNull
    private Instant lastUpdate= Instant.now();
}