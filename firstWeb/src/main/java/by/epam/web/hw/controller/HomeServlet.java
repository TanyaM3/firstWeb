package by.epam.web.hw.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String loginParameter = "Login";
	private final String registrParameter = "Registration";
	private final String confirmParameter = "confirm";
	private final String loginPath = "/WEB-INF/jsp/login.jsp";
	private final String registrPath = "/WEB-INF/jsp/registration.jsp";

	public HomeServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher;
		if (request.getParameter(confirmParameter).equals(loginParameter)) {
			requestDispatcher = request.getRequestDispatcher(loginPath);
			requestDispatcher.forward(request, response);
		} else if (request.getParameter(confirmParameter).equals(registrParameter)) {
			requestDispatcher = request.getRequestDispatcher(registrPath);
			requestDispatcher.forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}