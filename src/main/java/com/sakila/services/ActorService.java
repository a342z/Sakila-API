package com.sakila.services;

import java.util.ArrayList;
import java.util.List;

import com.sakila.mappers.ActorMapper;
import com.sakila.models.dtos.ActorDto;
import com.sakila.models.entities.Actor;
import com.sakila.repositories.interfaces.ActorRepository;

public class ActorService {
    private final ActorRepository actorRepository;
    private final ActorMapper actorMapper;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
        this.actorMapper = ActorMapper.INSTANCE;
    }

    public List<ActorDto> getAllActors() {
        List<ActorDto> actorsDto = new ArrayList<>();
        for (Actor actor : actorRepository.getAllActors()) {
            actorsDto.add(actorMapper.toDto(actor));
        }
        return actorsDto;
    }

    public ActorDto getActorById(int id) {
        return actorMapper.toDto(actorRepository.getActorById(id));
    }

    public void addActor(ActorDto actorDto) {
        Actor actor = actorMapper.toEntity(actorDto);
        actorRepository.addActor(actor);
    }

    public void updateActor(int id, ActorDto actorDto) {
        Actor actor = actorMapper.toEntity(actorDto);
        actor.setId(id);
        actorRepository.updateActor(actor);
    }

    public void deleteActor(int id) {
        actorRepository.deleteActor(id);
    }

}
