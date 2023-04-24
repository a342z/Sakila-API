package com.sakila.mappers;

import com.sakila.models.dtos.PaymentDto;
import com.sakila.models.entities.Payment;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface PaymentMapper extends ClassMapper<Payment, PaymentDto> {
    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(PaymentDto paymentDto, @MappingTarget Payment payment);
}