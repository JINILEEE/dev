package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/div")
public class DivideServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String n1 = req.getParameter("n1");
		String n2 = req.getParameter("n2");
		
		double a = Integer.parseInt(n1);
		double b = Integer.parseInt(n2);
		double result = a/b;
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("<h1>");
		pw.write("divide ::: " + result);
		pw.write("<h1>");
	
	}
	
}
