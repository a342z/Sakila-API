package com.sakila.repositories.implementations;

import com.sakila.models.entities.Actor;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.interfaces.ActorRepository;
import com.sakila.repositories.interfaces.StaffRepository;
import com.sakila.utils.EntityManagerUtil;

public class StaffRepositoryImp extends CrudRepositoryImp<Staff> implements StaffRepository {

    public StaffRepositoryImp() {
        super(EntityManagerUtil.getEntityManager(), Staff.class);
    }

}
