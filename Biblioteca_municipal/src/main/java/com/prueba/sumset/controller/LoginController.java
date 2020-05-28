package com.prueba.sumset.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping
	public String login() {
		return "login";
	}

	@RequestMapping("/verificarUsuario")
	public String verificarUsuario(HttpServletRequest request, Model model) {
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		if (username.equals("jorge") && password.equals("123")) {
			return "prestamo";
		} else {
			return "login";
		}
	}
}
