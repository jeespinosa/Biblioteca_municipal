package com.prueba.sumset.model;

import java.util.Date;

public class Prestamo {
	
	private int idUsuario;
	private int idLibro;
	private Date fechaLibro;
	
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
