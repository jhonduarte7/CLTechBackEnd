package com.cltech.lis.api.rest.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cltech.lis.api.rest.models.entity.Orden;
import com.cltech.lis.api.rest.models.entity.Paciente;
import com.cltech.lis.api.rest.models.entity.Tipo;
import com.cltech.lis.api.rest.models.services.IPacienteService;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PacienteRestController {
	
	@Autowired
	IPacienteService pacienteService;
	
	@GetMapping("/pacientes")
	public List<Paciente> findAll(){
		
		return pacienteService.findAll();
	}
	
	
	@GetMapping("/pacientes/tipos")
	public List<Tipo> listarTipo(){
		
		return pacienteService.findAllTipos();
	}
	
	@GetMapping("/pacientes/{id}")
	public Paciente EncontrarUno(Long id) {
		
		return pacienteService.findById(id);
	}
	
	@PutMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente actualizar(@RequestBody Paciente paciente, @PathVariable Long id) {
		
		Paciente PacienteActual = pacienteService.findById(id);
		
		
		PacienteActual.setNombres(paciente.getNombres());
		PacienteActual.setApellidos(paciente.getApellidos());
		PacienteActual.setDocumentoIdentidad(paciente.getDocumentoIdentidad());
		
		
		return pacienteService.save(PacienteActual);
		
	}
	
	
	@DeleteMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		pacienteService.delete(id);
	}
	






}
