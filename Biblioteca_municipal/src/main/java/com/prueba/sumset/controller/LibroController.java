package com.prueba.sumset.controller;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.sumset.model.Libro;
import com.prueba.sumset.model.Prestamo;

public class LibroController {

	@RequestMapping("/registarLibro")
	public String registrar(@RequestParam("txtNombre") String nombreLibro, @RequestParam("txtDescripcion") String descripcion, @RequestParam("txtEdad") int edad,@RequestParam("txtZona")int idZona)
	{
		
		SessionFactory factory2 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Libro.class).buildSessionFactory();
		
		Session session = factory2.openSession();

		try
		{
			
			session.beginTransaction();
			List<Libro> libros = session.createQuery("from Libro").getResultList();
			
		
			
				Libro libro = new Libro(libros.size() + 1, nombreLibro, descripcion, edad, idZona);
				session.save(libro);
				session.getTransaction().commit();
				
			
		}
		finally
		{
		
		}
		 return "prestamo";
	}
}
