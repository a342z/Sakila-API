package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Store} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="store")
public class StoreDto implements Serializable,Identifiable {
    private Short id;
    @NotNull
    private StaffDto managerStaff;
    @NotNull
    private AddressDto address;
    @NotNull
    private Instant lastUpdate = Instant.now();
}