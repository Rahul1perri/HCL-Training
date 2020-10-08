package org.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public index() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<h1 Style=\"text-align:center; color:red;\">Welcome to Hall Paradise</h1>");
		pw.print("<p Style=\"text-align:center; color:red;\">The type of events are</p>");
		pw.println("<ul Style=\"color:red;padding-left:45%;\">");
		pw.println("<li >Exhibition</li>");
		pw.println("<li>Stage Show</li>");
		pw.println("</ul>");
		pw.close();

	}

}
