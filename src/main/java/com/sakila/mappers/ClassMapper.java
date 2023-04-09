package com.sakila.mappers;

public interface ClassMapper<T, D> {
    D toDto(T entity);
    T toEntity(D dto);
}