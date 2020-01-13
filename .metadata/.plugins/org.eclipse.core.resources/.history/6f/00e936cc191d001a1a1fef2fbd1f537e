package com.cltech.lis.api.rest.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	






}
