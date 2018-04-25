package com.controller.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.Request;

import sun.rmi.server.Dispatcher;
import com.model.demo.LayerStudent;
import com.model.demo.Student;

import java.util.*;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	List<Student> data = new ArrayList<Student>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		List<Student> data = LayerStudent.getStudent(); 
		request.setAttribute("data", data);
		
		RequestDispatcher view = request.getRequestDispatcher("view_data.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.print(firstName);
		
		
		data.add(new Student(firstName, lastName, email));
//		request.setAttribute("data", data);
		doGet(request, response);
		
		
	}

}
