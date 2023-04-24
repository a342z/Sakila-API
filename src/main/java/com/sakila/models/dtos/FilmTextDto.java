package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.sakila.models.entities.FilmText} entity
 */
@Data
public class FilmTextDto implements Serializable,Identifiable  {
    private final Short id;
    @Size(max = 255)
    @NotNull
    private final String title;
    @Size(max = 255)
    private final String description;
}