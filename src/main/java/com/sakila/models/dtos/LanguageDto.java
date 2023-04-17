package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Language} entity
 */
@Data
public class LanguageDto implements Serializable,Identifiable {
    private  Short id;
    @Size(max = 20)
    @NotNull
    private  String name;
    @NotNull
    private  Instant lastUpdate = Instant.now();
}