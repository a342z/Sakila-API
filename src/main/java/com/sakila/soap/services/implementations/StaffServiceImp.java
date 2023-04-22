package com.sakila.soap.services.implementations;

import com.sakila.mappers.StaffMapper;
import com.sakila.models.dtos.StaffDto;
import com.sakila.models.entities.Staff;
import com.sakila.repositories.implementations.StaffRepositoryImp;
import com.sakila.soap.services.interfaces.StaffService;
import jakarta.jws.WebService;


public class StaffServiceImp extends CrudServiceImp<Staff, StaffDto> implements StaffService {

    public StaffServiceImp() {
        super(new StaffRepositoryImp(), StaffMapper.INSTANCE);
    }

   
}
