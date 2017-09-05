package com.ajaxprac01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AJAX01Servlet
 */
@WebServlet("/AJAX01Servlet")
public class AJAX01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AJAX01Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		//response.setContentType("text/plain"); ?? --> try this too
		if(request.getParameter("findTxt").equalsIgnoreCase("java")){
			response.getWriter().println(
					"<topic>" + 
						"<tutorial>JAVA language</tutorial>" +
						"<tutorial>Introduction to Java Programming</tutorial>" +
						"<tutorial>JAVA Servlet</tutorial>" +
					"</topic>");
		}else{
			response.getWriter().println(
					"<topic>" + 
						"<tutorial>Topic Not Found</tutorial>" +
					"</topic>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
