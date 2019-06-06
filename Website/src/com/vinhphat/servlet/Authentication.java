package com.vinhphat.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinhphat.model.DatabaseManagement;

/**
 * Servlet implementation class Authentication
 */
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authentication() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.setAttribute("name", "Phat");
		
		DatabaseManagement dm = new DatabaseManagement();
		if(dm.checkUser(username, password)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ImageShow");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
		
		
	  
		
	}

}
