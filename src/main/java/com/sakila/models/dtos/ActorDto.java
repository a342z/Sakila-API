package com.sakila.models.dtos;

import java.io.Serializable;
import java.time.Instant;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name="actor")
public class ActorDto implements Serializable,Identifiable{
    private Integer id;
    private String firstName;
    private String lastName;
    private Instant lastUpdate = Instant.now();
}
