package com.sakila.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class FilmActorId implements Serializable {
    private static final long serialVersionUID = -5679348365169240661L;
    @NotNull
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @NotNull
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FilmActorId entity = (FilmActorId) o;
        return Objects.equals(this.actorId, entity.actorId) &&
                Objects.equals(this.filmId, entity.filmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId);
    }

}