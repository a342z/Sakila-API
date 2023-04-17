package com.sakila.api.controllers;

import java.net.URI;
import java.util.List;

import com.sakila.models.dtos.Identifiable;
import com.sakila.services.interfaces.CrudService;
import com.sakila.utils.EntityManagerUtil;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public abstract class ResourceController<T extends Identifiable> {
    private CrudService<T> service;

    public ResourceController(CrudService<T> service) {
        this.service = service;
    }

    @GET
    public List<T> getAll() {
        List<T> dtos = service.getAll();
        System.out.println(dtos.get(0));
        EntityManagerUtil.releaseEntityManager();
        return dtos;
    }

    @GET
    @Path("{id}")
    public T getById(@PathParam("id") int id) {
        T dto = service.getById(id);
        EntityManagerUtil.releaseEntityManager();
        if (dto == null) {
            throw new NotFoundException("Resource with ID " + id + " not found");
        }
        return dto;
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") int id, T updatedDto) {
        T existingDto = service.getById(id);
        if (existingDto == null) {
            throw new NotFoundException("Resource with ID " + id + " not found");
        }
        service.update(id, updatedDto);
        EntityManagerUtil.releaseEntityManager();
        return Response.ok().entity("Resource with ID " + id + " updated").build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        T dto = service.getById(id);
        if (dto == null) {
            throw new NotFoundException("Resource with ID " + id + " not found");
        }
        service.delete(id);
        EntityManagerUtil.releaseEntityManager();
        return Response.ok().entity("Resource with ID " + id + " deleted").build();
    }

    @POST
    public Response add(T dto, @Context UriInfo uriInfo) {
        T addedDto = service.add(dto);
        EntityManagerUtil.releaseEntityManager();
        URI resourceUri = uriInfo.getAbsolutePathBuilder().path(String.valueOf(addedDto.getId())).build();
        return Response.created(resourceUri).entity("New resource added with ID: " + addedDto.getId()).build();
    }
}
