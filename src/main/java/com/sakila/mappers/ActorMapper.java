package com.sakila.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;

@Mapper
public interface ActorMapper extends ClassMapper<Actor,ActorDto> {
    ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);
}
