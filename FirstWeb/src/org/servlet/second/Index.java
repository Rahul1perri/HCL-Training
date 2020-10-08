package org.servlet.second;

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
		pw.print("<h1 Style=\"text-align:center; color:green;\">Welcome to Popular Paradise</h1>");
		pw.write("<div Style=\"text-align:center;\">");
		pw.write("<a href='./Exhibition'>Exhibition</a> <br>");
		pw.write("<a href='./StageShow'>Stage Show</a>");
		pw.write("</div>");
		pw.close();
                        
	}

}
