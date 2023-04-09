package com.sakila.repositories.implementations;

import java.util.List;

import com.sakila.models.entities.Actor;
import com.sakila.repositories.interfaces.ActorRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ActorRepositoryImp extends CrudRepositoryImp<Actor> implements ActorRepository{

    // private EntityManager em;

    public ActorRepositoryImp(EntityManager em) {
        super(em, Actor.class);
        // this.em = em;
    }

    // @Override
    // public List<Actor> getAllActors() {
    // return em.createQuery("SELECT a FROM Actor a", Actor.class).getResultList();
    // }

    // @Override
    // public Actor getActorById(int id) {
    // return em.find(Actor.class, id);
    // }

    // @Override
    // public void addActor(Actor actor) {
    // em.persist(actor);
    // }

    // @Override
    // public void updateActor(Actor actor) {
    // em.merge(actor);
    // }

    // @Override
    // public void deleteActor(int id) {
    // em.remove(getActorById(id));
    // }

}
