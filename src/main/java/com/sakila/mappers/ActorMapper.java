package com.sakila.mappers;

import java.util.logging.Logger;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;

@Mapper
public interface ActorMapper extends ClassMapper<Actor,ActorDto> {
    ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);

    // ActorDto toDto(Actor entity);
    // Actor toEntity(ActorDto dto);
}
