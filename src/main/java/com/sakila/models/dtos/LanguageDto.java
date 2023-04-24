package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Language} entity
 */
@XmlRootElement(name="language")
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto implements Serializable,Identifiable {
    private  Short id;
    private  String name;
    private  Instant lastUpdate = Instant.now();

    @XmlElement
    public Short getId() {
        return id;
    }
    public void setId(Short id) {
        this.id = id;
    }
    @XmlElement(name="language_name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name="last_update")
    public Instant getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}