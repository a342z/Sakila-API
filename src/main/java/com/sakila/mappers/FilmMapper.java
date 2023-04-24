package com.sakila.mappers;

import com.sakila.models.dtos.FilmDto;
import com.sakila.models.entities.Film;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmMapper extends ClassMapper<Film, FilmDto> {
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);
    
    // @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    // Film partialUpdate(FilmDto filmDto, @MappingTarget Film film);
}