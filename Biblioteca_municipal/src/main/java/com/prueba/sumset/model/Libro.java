package com.prueba.sumset.model;

import javax.persistence.*;

@Entity
@Table(name="libro")
public class Libro {

	public Libro()
	{
	}
	public Libro(int idLibro, String nombre, String descripcion, int categoriaEdad, int idZona)
	{
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoriaEdad = categoriaEdad;
		this.idZona = idZona;
	}
	@Id
	@Column(name="idLibro")
	private int idLibro;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="categoriaEdad")
	private int categoriaEdad;
	@Column(name="idZona")
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
