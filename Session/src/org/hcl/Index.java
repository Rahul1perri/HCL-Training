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
		pw.write("<h1 Style=\"text-align:center;color:green\">Event Management System</h1>");
		pw.write("<form action=\"./Display\" method=\"post\">");
		pw.write("Event Name <input type=\"text\" name=\"eventname\">");
		pw.write("<input type=\"submit\" value=\"Go\">");
		pw.write("</form>");
		pw.close();
	}

}
