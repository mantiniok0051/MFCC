package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultas extends Conexion {

	
	
	
	public boolean registrar(String nombre, String apellido, String email, String usuario, String pass )
	{
		PreparedStatement pst= null;
		
		try {
				String con= "INSERT INTO `usuarios`(`nombre`, `apellido`, `email`, `usurario`, `pass`) VALUES (?,?,?,?,?)";
				pst= getConnection().prepareStatement(con);
				pst.setString(1, nombre);
				pst.setString(2, apellido);
				pst.setString(3, email);
				pst.setString(4, usuario);
				pst.setString(5, pass);
				
				if (pst.executeUpdate() == 1) { System.out.println("1 new record has been added");
				                                return true;}
			} 
		catch (Exception e) {System.err.println("Error: "+e);}
		finally{
					try {	if (getConnection() != null) {getConnection().close();}
						 	if (pst != null) {pst.close();}
						 } 
					catch (Exception e2) {System.err.println("Error: "+e2);}
				}
		
		return false;
	}
	
	public boolean autenticacion(String usr, String pwd)
	{
		PreparedStatement pst= null;
		ResultSet 		  rs= null;
				
		try {String consulta= "SELECT * FROM `usuarios` WHERE `usurario` = ? and pass = ?";
			 pst= getConnection().prepareStatement(consulta);
			 pst.setString(1, usr);
			 pst.setString(2, pwd);
			 rs= pst.executeQuery();
			 
			 if (rs.absolute(1)) {return true;}
		} 
		catch (Exception e) {System.err.println("Error: "+e);}
		finally{
					try {	if (getConnection() != null) {getConnection().close();}
						 	if (pst != null) {pst.close();}
						 	if (rs != null) {rs.close();}
						 } 
					catch (Exception e2) {System.err.println("Error: "+e2);}
				}
		
		return false;
	}

}
