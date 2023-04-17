package com.sakila.services.implementations;

import com.sakila.mappers.FilmMapper;
import com.sakila.models.dtos.FilmDto;
import com.sakila.models.entities.Film;
import com.sakila.repositories.implementations.FilmRepositoryImp;
import com.sakila.repositories.interfaces.FilmRepository;
import com.sakila.services.interfaces.FilmService;

public class FilmServiceImp extends CrudServiceImp<Film,FilmDto> implements FilmService{
    public FilmServiceImp() {
        super(new FilmRepositoryImp(), FilmMapper.INSTANCE);
    }
}

