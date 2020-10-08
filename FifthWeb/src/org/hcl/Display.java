package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   response.setContentType("text/html");
                   ServletContext context=getServletContext();
                   PrintWriter pw=response.getWriter();
                   pw.write("<h1 Style=\\\"text-align:center;color:green;\\\">Event Details</h1>");
                   pw.write("<table border='1'>");
                   pw.write("<tr border='1'>");
                   pw.write("<td>EventName</td><td>HallName</td><td>Price</td>");
                   pw.write("</tr>");
                    pw.write("<tr border='1'>");
                    pw.write("<td>"+context.getInitParameter("EventName")+"</td><td>"+context.getInitParameter("HallName")+
                    		"</td><td>"+context.getInitParameter("Price")+"</td>");
                    pw.write("</tr>");
                    pw.write("<tr border='1'>");
                    pw.write("<td>"+context.getInitParameter("Eventname")+"</td><td>"+context.getInitParameter("Hallname")+
                    		"</td><td>"+context.getInitParameter("price")+"</td>");
                    pw.write("</tr>");	  
                   pw.write("</table>");
                   pw.close();
		
		
		
	}

}
