<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align = "center">
		<form action = "verificarUsuario" method = "get">
			<label>Usuario:</label>  <input type="text" name="txtUsername">
			<br>
			<br>
			<label>Contraseña:</label>  <input type="password" name="txtPassword">
			<br>
			<br>			
			<input type = "submit" value = "Aceptar">
		</form>			
	</div>
</body>
</html>