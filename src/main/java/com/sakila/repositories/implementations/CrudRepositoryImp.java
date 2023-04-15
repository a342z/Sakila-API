package com.sakila.repositories.implementations;

import java.util.List;
import com.sakila.repositories.interfaces.CrudRepository;
import jakarta.persistence.EntityManager;

public abstract class CrudRepositoryImp<T> implements CrudRepository<T> {

    private EntityManager em;
    private Class<T> type;

    public CrudRepositoryImp(EntityManager em, Class<T> type) {
        this.em = em;
        this.type = type;
    }

    @Override
    public List<T> getAll() {
        return em.createQuery("SELECT t FROM " + type.getSimpleName() + " t", type).getResultList();
    }

    @Override
    public T getById(int id) {
        return em.find(type, id);
    }

    @Override
    public T add(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public T update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override   
    public void delete(int id) {
        em.getTransaction().begin();
        em.remove(getById(id));
        em.getTransaction().commit();
    }

}
