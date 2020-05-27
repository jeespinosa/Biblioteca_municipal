package com.prueba.sumset.model;

import java.awt.Image;

public class Libro {

	private int idLibro;
	private String nombre;
	private String descripcion;
	private Image portada;
	private int categoriaEdad;
	private int idZona;
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Image getPortada() {
		return portada;
	}
	public void setPortada(Image portada) {
		this.portada = portada;
	}
	public int getCategoriaEdad() {
		return categoriaEdad;
	}
	public void setCategoriaEdad(int categoriaEdad) {
		this.categoriaEdad = categoriaEdad;
	}
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
}
