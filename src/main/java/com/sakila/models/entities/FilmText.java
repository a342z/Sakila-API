package com.sakila.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id", nullable = false)
    private Short id;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}