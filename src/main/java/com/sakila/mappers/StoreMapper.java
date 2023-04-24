package com.sakila.mappers;

import com.sakila.models.dtos.StoreDto;
import com.sakila.models.entities.Store;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StoreMapper extends ClassMapper<Store, StoreDto> {
    StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Store partialUpdate(StoreDto storeDto, @MappingTarget Store store);
}