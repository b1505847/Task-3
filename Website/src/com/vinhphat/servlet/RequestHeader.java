package com.vinhphat.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeader
 */
@WebServlet("/RequestHeader")
public class RequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

//		Enumeration<String> headerNames = request.getHeaderNames();
//		 String ipAddress = request.getHeader("X-FORWARDED-FOR");  
//		 String appUrl = request.getScheme() + "://"+ request.getLocalAddr();
//	       if (ipAddress == null) {  
//	         ipAddress = request.getRemoteAddr();  
//	   }
//	       System.out.println(ipAddress);

//		while (headerNames.hasMoreElements()) {
//			 
//            String headerName = headerNames.nextElement();
//            out.println("<b>" + headerName + "</b>");
////            out.println("<br>");
// 
//            Enumeration<String> headers = request.getHeaders(headerName);
//            while (headers.hasMoreElements()) {
//                String headerValue = headers.nextElement();
//                out.println(headerValue);
//                out.println("<br>");
//            }
// 
//        }
		
		String ipAddress = request.getRemoteAddr();
		System.out.println(ipAddress);
		String language = request.getHeader("accept-language");
		System.out.println(language);
		String operating = request.getHeader("user-agent");
		System.out.println(operating);
		
		out.println("<b>Ip address: </b>" + ipAddress + "</br>");
		out.println("<b>Language: </b>" + language + "</br>");
		out.println("<b>Operating system: </b>" + operating + "</br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
