<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.prueba.sumset.model.*"%>
<%@page import="com.prueba.sumset.controller.PrestamoController"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prestamo</title>
</head>
<body>
	<h1 align="center">Prestamo de libros</h1>
	<br>
	<br>
	<div>
	<form action = "prestarLibro" method = "get">
		<label>Nombre del libro</label> <input type="text" name="txtLibro">
		<br> <br> <br>
		<input type = "submit" value = "Prestar">
		</form>
		<button onclick="location.href='informacion'">Mas informacion</button>
		
	</div>
	<br>
	<br>
	<br>
	<fieldset>
		<Legend>
			<strong>Lista de libros</strong>
		</Legend>
		<table align="center" border="1px" width="80%">
			<tr>
				<th>Nombre</th>
				<th>Descripcion</th>
				<th>Categoria de edad</th>
			</tr>
			<%
				PrestamoController prestamo = new PrestamoController();
			List<Libro> lista = prestamo.listarLibros();
			for (Libro libro : lista) {
			%>
			<tr>
				<th><%=libro.getNombre()%></th>
				<th><%=libro.getDescripcion()%></th>
				<th><%=libro.getCategoriaEdad()%></th>
			</tr>
			<%
				}
			%>
		</table>
	</fieldset>
	<br>
	<br>
	<fieldset>
		<Legend>
			<strong>Lista de Prestamos</strong>
		</Legend>
		<table align="center" border="1px" width="80%">
			<tr>
				<th>Nombre del Usuario</th>
				<th>Nombre del libro</th>
				<th>Fecha del prestamo</th>
			</tr>
			<%			
			List<Prestamo> listaPrestamo = prestamo.listarPrestamo();
			
			for (Prestamo prestamos : listaPrestamo) {
			%>
			<tr>
				<th><%= prestamos.getIdUsuario()%></th>
				<th><%= prestamos.getIdLibro()%></th>
				<th><%= prestamos.getFechaPrestamo()%></th>
			</tr>
			<%
				}
			%>
		</table>
	</fieldset>

</body>
</html>