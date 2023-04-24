package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Film} entity
 */
@XmlRootElement(name="film")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto implements Serializable,Identifiable {
    private Integer id;
    @Size(max = 128)
    @NotNull
    private String title;
    @Size(max = 255)
    private String description;
    private Integer releaseYear;
    @NotNull
    private LanguageDto language;
    private LanguageDto originalLanguage;
    private Short rentalDuration;
    @NotNull
    private BigDecimal rentalRate;
    private Integer length;
    @NotNull
    private BigDecimal replacementCost;
    @Size(max = 255)
    private String rating;
    @Size(max = 255)
    private String specialFeatures;
    @NotNull
    private Instant lastUpdate = Instant.now();
}