package com.cltech.lis.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cltech.lis.api.rest.models.entity.Orden;

public interface IOrdenDao extends CrudRepository<Orden, Long> {

}
