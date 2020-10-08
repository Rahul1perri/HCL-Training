package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Index() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	
		pw.write("<form action=\"./Display\" method='post'>");
		pw.write("Name<input type=\"text\" name=\"name\"><br>");
		pw.write("Phone Number<input type=\"text\" name=\"phonenumber\"><br>");
		pw.write("Email<input type=\"text\" name=\"email\"><br>");
		pw.write("City<input type=\"text\" name=\"city\"><br>");
		pw.write("<input type=\"submit\" value=\"Submit\">");
		pw.write("</form>");
	
		pw.close();
	
		
	}

}
