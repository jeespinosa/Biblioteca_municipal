package com.prueba.sumset.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlServerConnector {

	private String connectionString = "jdbc:mysql://localhost:3306/prueba?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String user = "root";
	private String password = "a123";
	
	public void conectar()
	{
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(connectionString, user, password);
			System.out.println("si se conecto");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
