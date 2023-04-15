package com.sakila.models.dtos;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ActorDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private Instant lastUpdate = Instant.now();
}
