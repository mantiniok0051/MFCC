package Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {

	
	public Conexion()
	{
		try {System.out.println("Opening SQLPipe....");
			 Class.forName(JClassName);
		     dbLink= DriverManager.getConnection(URL, dbUserName, dbPassword);
		     System.out.println("SQLPipe successfully opened!");
		     System.out.println("Proceeding with autentication....");} 
		catch (ClassNotFoundException e) 
			{System.err.println("ERROR: "+e);}
		catch (SQLException e)
			{System.err.println("ERROR: "+e);}
	}
		
		
	public static void main(String[] args)
	{@SuppressWarnings("unused")
	Conexion pipe= new Conexion();}

	
	public Connection getConnection(){return dbLink;}
	
	
	//Connection Assets
	private String dbUserName= "tomcat";
	private String dbPassword= "tomcat";
	private String dbHostName= "localhost";
	private String dbHostPort= "3306";
	private String dbSchemaID= "loginjsp";
	private String JClassName= "com.mysql.jdbc.Driver";
	private String URL= "jdbc:mysql://"+dbHostName+":"+dbHostPort+"/"+dbSchemaID;
	private Connection dbLink;
}
