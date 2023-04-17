package com.sakila.services.implementations;

import com.sakila.mappers.LanguageMapper;
import com.sakila.models.dtos.LanguageDto;
import com.sakila.models.entities.Language;
import com.sakila.repositories.implementations.LanguageRepositoryImp;
import com.sakila.repositories.interfaces.CrudRepository;
import com.sakila.services.interfaces.LanguageService;

public class LanguageServiceImp  extends CrudServiceImp<Language,LanguageDto> implements LanguageService{

    public LanguageServiceImp() {
        super(new LanguageRepositoryImp(), LanguageMapper.INSTANCE);
    }


}
