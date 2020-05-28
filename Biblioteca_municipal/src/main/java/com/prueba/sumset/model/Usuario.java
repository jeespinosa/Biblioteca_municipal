package com.prueba.sumset.model;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@Column(name="idUsuario")
	private int idUsuario;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="edad")
	private int edad;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
