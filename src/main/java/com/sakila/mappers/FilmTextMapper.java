package com.sakila.mappers;

import com.sakila.models.dtos.FilmTextDto;
import com.sakila.models.entities.FilmText;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmTextMapper extends ClassMapper<FilmTextDto, FilmText> {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FilmText partialUpdate(FilmTextDto filmTextDto, @MappingTarget FilmText filmText);
}