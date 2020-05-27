package com.prueba.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping
	public String login()
	{
		return "login";
	}
	@RequestMapping("/prestamo")
	public String prestamo()
	{
		return "prestamo";
	}
	@RequestMapping("/informacion")
	public String informacion() 
	{
		return "informacion";
	}
}
