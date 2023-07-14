package com.ipartek.formacion.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hola-jsp")
public class HolaMundoJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");
		String respuesta = "hola" + nombre;

		request.setAttribute("saludo", respuesta);

		request.getRequestDispatcher("hola.jsp").forward(request, response);
	}
}
