package com.sakila.mappers;

import com.sakila.models.dtos.RentalDto;
import com.sakila.models.entities.Rental;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface RentalMapper extends ClassMapper<Rental, RentalDto> {
    RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rental partialUpdate(RentalDto rentalDto, @MappingTarget Rental rental);
}