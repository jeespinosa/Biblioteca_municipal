package com.prueba.sumset.model;

import javax.persistence.*;

@Entity
@Table(name="zona")
public class Zona {

	@Id
	@Column(name="idZona")
	private int idZona;
	@Column(name="nombre")
	private String nombre;
	
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
