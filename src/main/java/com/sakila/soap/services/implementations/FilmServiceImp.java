package com.sakila.soap.services.implementations;

import com.sakila.mappers.FilmMapper;
import com.sakila.models.dtos.FilmDto;
import com.sakila.models.entities.Film;
import com.sakila.repositories.implementations.FilmRepositoryImp;
import com.sakila.soap.services.interfaces.FilmService;
import jakarta.jws.WebService;


public class FilmServiceImp extends CrudServiceImp<Film,FilmDto> implements FilmService {
    public FilmServiceImp() {
        super(new FilmRepositoryImp(), FilmMapper.INSTANCE);
    }
}

