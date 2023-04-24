package com.sakila.mappers;

import com.sakila.models.dtos.LanguageDto;
import com.sakila.models.entities.Language;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface LanguageMapper extends ClassMapper<Language, LanguageDto> {
    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Language partialUpdate(LanguageDto languageDto, @MappingTarget Language language);


}