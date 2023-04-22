package com.sakila.services.implementations;

import com.sakila.mappers.ActorMapper;
import com.sakila.mappers.StaffMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.dtos.StaffDto;
import com.sakila.models.entities.Actor;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.implementations.ActorRepositoryImp;
import com.sakila.repositories.implementations.StaffRepositoryImp;
import com.sakila.services.interfaces.ActorService;
import com.sakila.services.interfaces.StaffService;

public class StaffServiceImp extends CrudServiceImp<Staff, StaffDto> implements StaffService {

    public StaffServiceImp() {
        super(new StaffRepositoryImp(), StaffMapper.INSTANCE);
    }

   
}
