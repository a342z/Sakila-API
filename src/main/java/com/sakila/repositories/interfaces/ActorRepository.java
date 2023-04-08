package com.sakila.repositories.interfaces;

import java.util.List;

import com.sakila.models.entities.Actor;

public interface ActorRepository {
    List<Actor> getAllActors();
    Actor getActorById(int id);
    void addActor(Actor actor);
    void updateActor(Actor actor);
    void deleteActor(int id);
}
