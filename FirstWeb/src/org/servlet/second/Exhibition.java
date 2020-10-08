package org.servlet.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Exhibition() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h1 Style=\"text-align:center; color:green;\">Text Fair 2017 Expo</h1>");
		pw.write("<div Style=\"padding-left:35%;\">");
		pw.write("<table Style=\"border: 1px solid black;border-collapse: collapse;\">");
		pw.write("<tr Style=\"border: 1px solid black;border-collapse: collapse;\">");
		pw.write("<th Style=\"border: 1px solid black;border-collapse: collapse;\">Name</th>");
		pw.write("<td >Text Fair 2017 Expo</td>");
		pw.write("</tr>");
		pw.write("<tr Style=\"border: 1px solid black;border-collapse: collapse;\">");
		pw.write("<th Style=\"border: 1px solid black;border-collapse: collapse;\">Hall Name</th>");
		pw.write("<td>PVR Multiplex</td>");
		pw.write("</tr>");
		pw.write("<tr Style=\"border: 1px solid black;border-collapse: collapse;\">");
		pw.write("<th Style=\"border: 1px solid black;border-collapse: collapse;\">Start Date</th>");
		pw.write("<td>10/10/2020</td>");
		pw.write("</tr>");
		pw.write("<tr Style=\"border: 1px solid black;border-collapse: collapse;\">");
		pw.write("<th Style=\"border: 1px solid black;border-collapse: collapse;\">End Date</th>");
		pw.write("<td>10/10/2030</td>");
		pw.write("</tr>");
		pw.write("</table>");
		pw.write("</div>");
		pw.close();       
               
	}

}
