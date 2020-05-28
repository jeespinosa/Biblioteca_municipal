package com.prueba.sumset.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="prestamo")
public class Prestamo {
	
	public Prestamo (int idPrestamo, int idUsuario, int idLibro, Date fecha)
	{
		this.idPrestamo = idPrestamo;
		this.idUsuario = idUsuario;
		this.idLibro = idLibro;
		this.fechaPrestamo = fecha;
	}
	public Prestamo()
	{
		
	}
	@Id
	@Column(name="idPrestamo")
	private int idPrestamo;
	@Column(name="idUsuario")
	private int idUsuario;
	@Column(name="idLibro")
	private int idLibro;
	@Column(name="fechaPrestamo")
	private Date fechaPrestamo;
	
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
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
}
