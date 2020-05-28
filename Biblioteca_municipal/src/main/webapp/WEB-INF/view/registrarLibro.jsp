<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar un libro</title>
</head>
<body>
<div align = "center">
		<form action = "registarLibro" method = "get">
			<label>Nombre del libro:</label>  <input type="text" name="txtNombre">
			<br>
			<br>
			<label>Descripcion del libro:</label>  <input type="text" name="txtDescripcion">
			<br>
			<br>
			<label>Categoria de edad:</label>  <input type="number" name="txtEdad">
			<br>
			<br>
			<label>Zona:</label>  <input type="number" name="txtZona">	
			<br>
			<br>
			<input type = "submit" value = "Aceptar">
		</form>			
	</div>
</body>
</html>