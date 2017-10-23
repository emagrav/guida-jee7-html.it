package it.html.progetto1.webtest;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.html.progetto1.ejb32.ConverterBeanLocal;

@WebServlet("/SessionBeanTest")
public class SessionBeanTest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	private ConverterBeanLocal converterBeanLocal;

	public SessionBeanTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float conv = converterBeanLocal.celsiusToFahrenheit(30);

		response.getWriter().println("Conversion test:" + conv);
		System.out.println("Conversion test:" + conv);
	}

}
