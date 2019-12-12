package com.cltech.lis.api.rest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ordenes_lineas")
public class LineaOrden implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examen_id")
	private Examen examen;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Examen getExamen() {
		return examen;
	}


	public void setExamen(Examen examen) {
		this.examen = examen;
	}


	private static final long serialVersionUID = 1L;

}
