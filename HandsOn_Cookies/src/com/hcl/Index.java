package com.hcl;

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
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<h1 style='text-align:center;'>Ticket Dada</h1>");
		pw.println("<form action='./Confirm' method='post' style='margin-left:40%'>");
		pw.println("<table>");
		pw.println("<tr><td>Select Ticket Type:</td><td><select name='seatType' id='SeatingSection'>"
				+ "<option value='Platinum'>Platinum</option>" + "<option value='Gold'>Gold</option>"
				+ "<option value='Silver'>Silver</option>" + "<option value='Bronze'>Bronze</option></select></td><tr><br>");
		pw.println("<tr><td>Enter the Number of Ticket</td><td> <input type='number' name='ticketcount'></td></tr><br>");
		pw.println("<tr><td></td><td><input type='submit' value='Book ticket' id='book'></td></tr></table></form>");
		pw.close();
	}

}
