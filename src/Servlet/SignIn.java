package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controlador.Consultas;

/**
 * Servlet implementation class SignIn
 */
@SuppressWarnings("unused")
@WebServlet("/doSignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
        	throws ServletException, IOException
        		{
        			response.setContentType("text/html;charset=UTF-8");
        			PrintWriter out= response.getWriter();
        			
        			String nombre= request.getParameter("nombre");
        			String apellido= request.getParameter("apellido");
        			String email= request.getParameter("email");
        			String usuario= request.getParameter("user");        			
        			String password= request.getParameter("pass");
        			
        			Consultas co= new Consultas();
        			
        			if (co.registrar(nombre, apellido, email, usuario, password)) 
        				 {response.sendRedirect("confirm.jsp");}
        			else {response.sendRedirect("sign-in-error.jsp");}
        		
        		}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{processRequest(request, response);}
	


}
