package com.cltech.lis.api.rest.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cltech.lis.api.rest.models.dao.IOrdenDao;
import com.cltech.lis.api.rest.models.dao.IPacienteDao;
import com.cltech.lis.api.rest.models.entity.Orden;
import com.cltech.lis.api.rest.models.entity.Paciente;
import com.cltech.lis.api.rest.models.entity.Tipo;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	IPacienteDao pacienteDao;
	
	@Autowired
	IOrdenDao ordenDao;
	

	@Override
	@Transactional
	public List<Paciente> findAll() {
		
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	@Transactional
	public List<Tipo> findAllTipos() {
		
		return pacienteDao.findAllTipos();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		pacienteDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Paciente save(Paciente paciente) {
		
		return pacienteDao.save(paciente);
	}
	
	/*//////////////////////*******Ordenes*******//////////////////*/

	@Override
	@Transactional(readOnly = true)
	public Orden findOrdenById(Long id) {
		
		return ordenDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Orden saveOrden(Orden orden) {
		
		return ordenDao.save(orden);
	}

	@Override
	@Transactional
	public void deleteOrdenyById(Long id) {
		
		ordenDao.deleteById(id);
		
	}

	@Override
	public List<Orden> findAllOrdenes() {
		
		return (List<Orden>) ordenDao.findAll();
	}

	@Override
	public Paciente findById(Long id) {
	
		return pacienteDao.findById(id).orElse(null);
	}
	
	

}
