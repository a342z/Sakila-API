package com.sakila.repositories.implementations;

import com.sakila.models.entities.Film;
import com.sakila.repositories.interfaces.FilmRepository;
import com.sakila.utils.EntityManagerUtil;

public class FilmRepositoryImp extends CrudRepositoryImp<Film> implements FilmRepository {
    public FilmRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Film.class);
    }
}
