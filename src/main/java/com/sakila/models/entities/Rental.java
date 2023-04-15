package com.sakila.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "rental")
public class Rental {
    @Id
    @Column(name = "rental_id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @NotNull
    @Column(name = "inventory_id", nullable = false)
    private Integer inventoryId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;

    @NotNull
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @NotNull
    @Column(name = "rental_date", nullable = false)
    private Instant rentalDate;

    @Column(name = "return_date")
    private Instant returnDate;

}