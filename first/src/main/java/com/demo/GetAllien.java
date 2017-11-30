package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * Servlet implementation class GetAllien
 */
public class GetAllien extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("t1");
		AllienDao obj = new AllienDao();
		List<Allien> allien = obj.getAllien(str);
		for(Allien a: allien)
		  System.out.println(a);
			
	}

}
