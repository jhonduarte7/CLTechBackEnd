package com.cltech.lis.api.rest.models.services;

import java.util.List;

import com.cltech.lis.api.rest.models.entity.Orden;
import com.cltech.lis.api.rest.models.entity.Paciente;
import com.cltech.lis.api.rest.models.entity.Tipo;

public interface IPacienteService {	
	
	public List<Paciente> findAll();
	
	public List<Tipo> findAllTipos();
	
	public void delete(Long id);
	    
	public Paciente save(Paciente paciente);

	    
	/*//////////////////////*******Para llamar los dao de las ordenes*******//////////////////*/
	public Orden findOrdenById(Long id);
	    
	public Orden saveOrden(Orden orden);
	    
    public void deleteOrdenyById(Long id);

}
