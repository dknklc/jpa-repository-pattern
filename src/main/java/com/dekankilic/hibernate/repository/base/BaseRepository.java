package com.dekankilic.hibernate.repository.base;

import com.dekankilic.hibernate.model.BaseEntity;

import java.util.List;

public interface BaseRepository<E extends BaseEntity, I> { // We are making <E extends BaseEntity, I> because we do not want to give here any other class except for entity classes.
    void save(E entity);
    void update(E entity, I id);
    List<E> findAll();
    E findById(I id);
}
