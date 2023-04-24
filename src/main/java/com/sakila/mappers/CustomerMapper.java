package com.sakila.mappers;

import com.sakila.models.dtos.CustomerDto;
import com.sakila.models.entities.Customer;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CustomerMapper extends ClassMapper<Customer, CustomerDto> {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(CustomerDto customerDto, @MappingTarget Customer customer);
}