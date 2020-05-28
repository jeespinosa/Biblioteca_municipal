package com.prueba.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.sumset.connect.SqlServerConnector;

@Controller
public class LoginController {

	@RequestMapping
	public String login() {
		return "login";
	}

	@RequestMapping("/verificarUsuario")
	public String verificarUsuario(@RequestParam("txtUsername") String username,
			@RequestParam("txtPassword") String password) {
		
		SqlServerConnector connector = new SqlServerConnector();
		
		connector.conectar();
		if (username.equals("jorge") && password.equals("123")) {
			return "prestamo";
		} else {
			return "login";
		}
	}
}
