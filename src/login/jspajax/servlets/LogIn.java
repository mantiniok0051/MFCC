package login.jspajax.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.jspajax.controller.Consultas;

/**
 * login.jspajax.servlets implementation class LogIn
 */
@SuppressWarnings("unused")
@WebServlet("/doLogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {}
    
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException
    		{
    			response.setContentType("text/html;charset=UTF-8");
    			PrintWriter out= response.getWriter();
    			
    			String usuario=  request.getParameter("usuario");
    			String password= request.getParameter("pass");
    			
    			Consultas cons= new Consultas();
    			if (cons.autenticacion(usuario, password)) 
    				 {HttpSession objSession= request.getSession(true);
    				  objSession.setAttribute("usuario", usuario);
    				  response.sendRedirect("mydashboard.jsp");}
    			else {response.sendRedirect("log-in-error.jsp");}
    		
    		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		processRequest(request, response);
		
	}

}
