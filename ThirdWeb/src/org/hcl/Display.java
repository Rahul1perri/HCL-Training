package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Display() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String Name=request.getParameter("name");
		String PhoneNumber=request.getParameter("phonenumber");
		String Email=request.getParameter("email");
		String City=request.getParameter("city");
		pw.println("<h1>The User Details are<h1>");
		pw.write("<table border='1'>");
		pw.write("<tr>");
		pw.write("<td>Name</td><td>PhoneNumber</td><td>Email</td><td>City</td>");
		pw.write("</tr>");
		pw.write("<tbody>");
		pw.write("<td>"+Name+"</td><td>"+PhoneNumber+"</td><td>"+Email+"</td><td>"+City+"</td>");
		pw.write("</tbody>");
		pw.write("</table>");
		pw.close();
		
		
	}

}
