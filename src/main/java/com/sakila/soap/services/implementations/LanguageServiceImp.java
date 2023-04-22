package com.sakila.soap.services.implementations;

import com.sakila.mappers.LanguageMapper;
import com.sakila.models.dtos.LanguageDto;
import com.sakila.models.entities.Language;
import com.sakila.repositories.implementations.LanguageRepositoryImp;
import com.sakila.soap.services.interfaces.LanguageService;
import jakarta.jws.WebService;

public class LanguageServiceImp  extends CrudServiceImp<Language,LanguageDto> implements LanguageService {

    public LanguageServiceImp() {
        super(new LanguageRepositoryImp(), LanguageMapper.INSTANCE);
    }


}
