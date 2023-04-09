package com.sakila.repositories.implementations;

import java.util.List;

import com.sakila.repositories.interfaces.CrudRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

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
    @Transactional
    public void add(T entity) {
        em.persist(entity);
    }

    @Override
    @Transactional
    public void update(T entity) {
        em.merge(entity);
    }

    @Override
    @Transactional
    public void delete(int id) {
        em.remove(getById(id));
    }

}