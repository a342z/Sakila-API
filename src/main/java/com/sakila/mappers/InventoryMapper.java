package com.sakila.mappers;

import com.sakila.models.dtos.InventoryDto;
import com.sakila.models.entities.Inventory;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface InventoryMapper extends ClassMapper<Inventory, InventoryDto> {
    InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Inventory partialUpdate(InventoryDto inventoryDto, @MappingTarget Inventory inventory);
}