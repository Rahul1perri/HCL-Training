package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Display() {
        super();
       
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String n=request.getParameter("eventname");
		HttpSession session=request.getSession();
		session.setAttribute("eventname",n);
		pw.write("<form action=\"./GetDisplay\" method=\"post\">");
		pw.println("<div style='text-align:center; color:green;'>Welcome to this Event " + n + "</div><br>");
		pw.println("<input style='margin-left:45%;' type='submit' id='tag' value= 'Get Details'></form>");
		pw.close();

	}

}
