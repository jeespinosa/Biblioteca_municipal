package com.prueba.sumset.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.prueba.sumset.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping
	public String login() {
		return "login";
	}

	@GetMapping("/verificarUsuario")
	public String verificarUsuario(@RequestParam("txtUsername") String username,
			@RequestParam("txtPassword") String password) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		try
		{
			session.beginTransaction();
			Usuario usuario = (Usuario) session.createQuery("from Usuario user where user.username = '"+username+"' and user.password = '" + password + "' ").getSingleResult();
			if (usuario != null && usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
				PrestamoController prestamo = new PrestamoController(usuario.getIdUsuario());
				return "prestamo";
			} else {
				return "login";
			}
		}
		catch(Exception e)
		{
			factory.close();
			return "login";
		}
		
	}
}
