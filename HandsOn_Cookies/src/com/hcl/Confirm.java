package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Confirm() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String seatType = request.getParameter("seatType");
		Integer ticketcount = Integer.parseInt(request.getParameter("ticketcount"));

		Integer rate = 0;

		if (seatType.equals("Platinum")) {

			rate = 300 * ticketcount;

		} else if (seatType.equals("Gold")) {

			rate = 250 * ticketcount;

		} else if (seatType.equals("Silver")) {

			rate = 150 * ticketcount;

		} else if (seatType.equals("Bronze")) {

			rate = 100 * ticketcount;

		}
		
		Cookie type= new Cookie("seatType", seatType);
		Cookie count= new Cookie("ticketcount",ticketcount.toString() );
		Cookie ticketcost= new Cookie("rate", rate.toString());
		response.addCookie(type);
		response.addCookie(count);
		response.addCookie(ticketcost);
		
		pw.println("<h1 style='text-align:center;'>Ticket Confirmation</h1>");
		pw.println("<div style='text-align:center;'> The ticket rate is"+rate+"<br>");
		pw.println("Do you want to confirm your ticket?</div>");
		pw.println("<form action='./Display' method='post' style='text-align:center;'>");
		pw.println("<input type='submit' value='Confirm' id='confirm'></form>");
		pw.println("<form action='./Index' method='get' style='text-align:center;'>");
		pw.println("<input type='submit' value='Cancel' id='cancel'></form>");
		pw.close();
	}

}
