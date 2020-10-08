package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Validate() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String EventName=request.getParameter("eventname");
		String HallName=request.getParameter("hallname");
		String EventType=request.getParameter("eventtype");
		String Details=request.getParameter("details");
		String StartDate=request.getParameter("startdate");
		String EndDate=request.getParameter("enddate");
		if(EventName==""||HallName==""||EventType==""||Details==""||StartDate==""||EndDate=="") {
			RequestDispatcher rd=request.getRequestDispatcher("./Index");  
			pw.write("<h1 Style=\"text-align:center;color:green;\">");
			pw.write("Event Creating");
			pw.write("</h1>");
			 pw.write("<div Style=\"margin:0;border='1';\">");
			if(EventName=="") {pw.write("EventName is empty <br>");}
			if(HallName=="") {pw.write("HallName is empty <br>");}
			if(EventType=="") {pw.write("EventType is empty <br>");}
			if(Details=="") {pw.write("Details is empty <br>");}
			if(StartDate=="") {pw.write("StartDate is empty <br>");}
			if(EndDate=="") {pw.write("EndDate is empty <br>");}
			pw.write("</div>");
			 rd.include(request, response); 
		}else {
		
			pw.write("<h2>Successfully Inserted</h2>");
		pw.println("<h1>Event Creation<h1>");
		pw.write("<table border='1'>");
		pw.write("<tr>");
		pw.write("<td>EventName</td><td>HallName</td><td>EventType</td><td>Details</td><td>StartDate</td><td>EndDate</td>");
		pw.write("</tr>");
		pw.write("<tbody>");
		pw.write("<td>"+EventName+"</td><td>"+HallName+"</td><td>"+EventType+"</td><td>"+Details+"</td><td>"+ StartDate+"</td><td>"+EndDate+"<td></td>");
		pw.write("</tbody>");
		pw.write("</table>");
		pw.close();
		
		}
	}

}
