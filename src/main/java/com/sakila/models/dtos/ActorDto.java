package com.sakila.models.dtos;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ActorDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private Instant lastUpdate;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Instant getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    @Override
    public String toString() {
        return "ActorDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
                + lastUpdate + "]";
    }

    

    
}
