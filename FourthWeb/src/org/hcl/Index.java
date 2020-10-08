package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		pw.write("<form action=\"./Validate\" method=\"get\">");
		pw.write("Event Name<input type=\"text\" name=\"eventname\"><br>");
		pw.write("Hall Name<input type=\"text\" name=\"hallname\"><br>");
		pw.write("EventType<input type=\"radio\" value=\"Exhibition\" name=\"eventtype\">Exhibition<br>");
		pw.write("<input type=\"radio\" value=\"StageShow\" name=\"eventtype\">StageShow<br>");
		pw.write("Details<input type=\"text\" name=\"details\"><br>");
		pw.write("Owner<input type=\"text\" name=\"owner\"><br>");
		pw.write("Start Date<input type=\"text\" name=\"startdate\"><br>");
		pw.write("End Date<input type=\"text\" name=\"enddate\"><br>");
		pw.write("<input type=\"submit\" value=\"Create\">");
		pw.write("</form>");
		pw.close();
	}

}
