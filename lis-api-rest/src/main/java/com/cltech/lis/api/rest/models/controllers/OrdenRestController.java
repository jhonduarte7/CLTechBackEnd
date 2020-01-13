package com.cltech.lis.api.rest.models.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cltech.lis.api.rest.models.entity.Orden;
import com.cltech.lis.api.rest.models.services.IPacienteService;


//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class OrdenRestController {
	
	
	@Autowired
	private IPacienteService pacienteService;//En este servicio tengo los metodos que implementan el dao del crud repository para orden
	
	
	 
	@GetMapping("/ordenes")
	public List<Orden>indexOrdenes(){
		 
		 return pacienteService.findAllOrdenes();
	 }
	
	
	@GetMapping("/orden/{id}")
	public Orden showId(@PathVariable Long id) {
		
		return pacienteService.findOrdenById(id);
	}
	
	@DeleteMapping("/orden/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		pacienteService.deleteOrdenyById(id);
	}
	
	
	@PostMapping("/orden")
	@ResponseStatus(HttpStatus.CREATED)
	public Orden create(@RequestBody Orden orden) {
		
		return pacienteService.saveOrden(orden);
		
		
	}
	
	
	@PutMapping("/orden/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Orden actualizar(@RequestBody Orden orden, @PathVariable Long id) {
		
		Orden OrdenActual = pacienteService.findOrdenById(id);
		
	    OrdenActual.setTipo(orden.getTipo());		
		OrdenActual.setFechaIngreso(orden.getFechaIngreso());
		OrdenActual.setPaciente(orden.getPaciente());
		
		
		return pacienteService.saveOrden(OrdenActual);
		
	}

}
