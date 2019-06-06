package com.vinhphat.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet(description = "This is example", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		loadParameter(request, response, "Get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		loadParameter(request, response, "Post");
	}
	
	private void loadParameter(HttpServletRequest request, HttpServletResponse response, String method) throws ServletException, IOException {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		ServletConfig config = this.getServletConfig();
		ServletContext context = this.getServletContext();
		String name = context.getInitParameter("name");
		String year = context.getInitParameter("year");
//		String song = config.getInitParameter("song");
		PrintWriter writer = response.getWriter();
		writer.println("Hello world by" + method+"<br>");
		writer.println("My name is : "+ name);
		writer.println("Year is: " + year);
	}
}
