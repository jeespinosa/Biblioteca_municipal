package com.prueba.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InformacionController {
	
	@RequestMapping("/informacion")
	public String informacion() 
	{
		return "informacion";
	}	
	@RequestMapping("/informes")
	public String informes() 
	{
		return "informes";
	}	
	@RequestMapping("/registrarLibro")
	public String registrarLibro() 
	{
		return "registrarLibro";
	}	
	
}
