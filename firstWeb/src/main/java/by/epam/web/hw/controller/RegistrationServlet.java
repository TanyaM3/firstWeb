package by.epam.web.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;

import by.epam.web.hw.bean.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String loginParameter = "login";
	private final String passwordParameter = "password";
	private final String emailParameter = "email";
	
	public RegistrationServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String login = request.getParameter(loginParameter);
		String password = request.getParameter(passwordParameter);
		String email = request.getParameter(emailParameter);

		User user = new User(login, email, password);

		// Database

	}
}