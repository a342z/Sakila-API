package com.sakila.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.sakila.models.entities.Address} entity
 */
@XmlRootElement(name="address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto implements Serializable,Identifiable  {
    private Integer id;
    @Size(max = 50)
    @NotNull
    private String address;
    @Size(max = 50)
    private String address2;
    @Size(max = 20)
    @NotNull
    private String district;
    @NotNull
    private CityDto city;
    @Size(max = 10)
    private String postalCode;
    @Size(max = 20)
    @NotNull
    private String phone;
    @NotNull
    private Instant lastUpdate= Instant.now();
}