package com.sakila.mappers;

import com.sakila.models.dtos.StaffDto;
import com.sakila.models.entities.Staff;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StaffMapper extends ClassMapper<Staff, StaffDto> {
    StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Staff partialUpdate(StaffDto staffDto, @MappingTarget Staff staff);

    Staff toEntity(StaffDto staffDto);

    StaffDto toDto(Staff staff);
}