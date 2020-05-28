package com.prueba.sumset.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="prestamo")
public class Prestamo {
	@Id
	private int idPrestamo;
	
	private int idUsuario;
	
	private int idLibro;
	private Date fechaLibro;
	
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public Date getFechaLibro() {
		return fechaLibro;
	}
	public void setFechaLibro(Date fechaLibro) {
		this.fechaLibro = fechaLibro;
	}
}
