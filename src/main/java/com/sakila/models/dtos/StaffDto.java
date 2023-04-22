package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Staff} entity
 */
@Data
public class StaffDto implements Serializable,Identifiable {
    private Short id;
    @Size(max = 45)
    @NotNull
    private String firstName;
    @Size(max = 45)
    @NotNull
    private String lastName;
    @NotNull
    private AddressDto address;
    private byte[] picture;
    @Size(max = 50)
    private String email;
    private Short storeId;
    @NotNull
    private Boolean active;
    @Size(max = 16)
    @NotNull
    private String username;
    @Size(max = 40)
    private String password;
    @NotNull
    private Instant lastUpdate = Instant.now();
}