package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Category} entity
 */
@XmlRootElement(name="language")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto  implements Serializable,Identifiable {
    private Short id;
    @Size(max = 25)
    @NotNull
    private String name;
    @NotNull
    private Instant lastUpdate = Instant.now();
}