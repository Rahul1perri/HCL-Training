package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetDisplay")
public class GetDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetDisplay() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		String s=(String) session.getAttribute("eventname");
		pw.write("Event"+s+"is planned to be held on 15/10/2020 in Rudofinium");
		
	}

}
