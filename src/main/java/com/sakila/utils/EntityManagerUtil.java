package com.sakila.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class EntityManagerUtil {
    private static ThreadLocal<EntityManager> entityManagerThreadLocal = new ThreadLocal<>();

    public static EntityManager getEntityManager() {
        EntityManager entityManager = entityManagerThreadLocal.get();
        if (entityManager == null) {
            EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtil.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityManagerThreadLocal.set(entityManager);
        }
        return entityManager;
    }

    public static void releaseEntityManager() {
        EntityManager entityManager = entityManagerThreadLocal.get();
        if (entityManager != null) {
            entityManager.close();
            entityManagerThreadLocal.remove();
        }
    }
}
