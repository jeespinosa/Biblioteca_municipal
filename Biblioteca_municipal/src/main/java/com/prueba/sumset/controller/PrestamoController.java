package com.prueba.sumset.controller;


import java.util.Date;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.sumset.model.Libro;
import com.prueba.sumset.model.Prestamo;
import com.prueba.sumset.model.Usuario;

@Controller
public class PrestamoController {

	private int id;
	
	public PrestamoController(int id)
	{
		this.id = id;
	}
	public PrestamoController()
	{
	}
	
	@RequestMapping("/prestarLibro")
	public String prestar(@RequestParam("txtLibro") String nombreLibro)
	{
		SessionFactory factory1 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Libro.class).buildSessionFactory();
		
		Session sessionLibro = factory1.openSession();
		
		SessionFactory factory2 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Prestamo.class).buildSessionFactory();
		
		Session sessionPrestamo = factory2.openSession();

		try
		{
			sessionLibro.beginTransaction();
			sessionPrestamo.beginTransaction();
			List<Prestamo> prestamos = sessionPrestamo.createQuery("from Prestamo").getResultList();
			Libro libro = (Libro) sessionLibro.createQuery("from Libro libro where libro.nombre = '" + nombreLibro + "' ").getSingleResult();
			Prestamo prestamo = (Prestamo) sessionPrestamo.createQuery("from Prestamo prestamo where prestamo.idLibro = '" + libro.getIdLibro() + "' ").getSingleResult();
			factory1.close();
			factory2.close();
		
			if(prestamo != null)
			{
				Prestamo libroPrestado = new Prestamo(prestamos.size() + 2,this.id, libro.getIdLibro(), new Date());
				
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Prestamo.class).buildSessionFactory();
				
				Session session = factory.openSession();
				session.beginTransaction();
				session.save(libroPrestado);
				session.getTransaction().commit();
				
			}
		}
		finally
		{
		
		}
		 return "prestamo";
	}
	
	public List<Libro> listarLibros()
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Libro.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		try
		{
			session.beginTransaction();
			List<Libro> lista = session.createQuery("from Libro").getResultList();
			return lista;
			
		}
		finally
		{
			factory.close();
		}	
	}
	public List<Prestamo> listarPrestamo()
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Prestamo.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		try
		{
			session.beginTransaction();
			List<Prestamo> lista = session.createQuery("from Prestamo").getResultList();
			return lista;
			
		}
		finally
		{
			factory.close();
		}	
	}
	
}
