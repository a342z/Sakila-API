package com.sakila.repositories.implementations;

import com.sakila.models.entities.Language;
import com.sakila.repositories.interfaces.LanguageRepository;
import com.sakila.utils.EntityManagerUtil;

public class LanguageRepositoryImp extends CrudRepositoryImp<Language> implements LanguageRepository {

    public LanguageRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Language.class);
    }

}
