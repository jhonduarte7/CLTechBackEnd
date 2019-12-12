package com.cltech.lis.api.rest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cltech.lis.api.rest.models.entity.Paciente;
import com.cltech.lis.api.rest.models.entity.Tipo;

public interface IPacienteDao extends CrudRepository<Paciente, Long> {
	
	@Query("from Tipo")
	public List<Tipo> findAllTipos();

}
