package webNew;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// send redirect system //int k = (int) req.getAttribute("s");
	 	HttpSession session = req.getSession();
		
		int k =  (int) session.getAttribute("k");
		k = k * k;
		PrintWriter out = res.getWriter();

		out.println("Square value: " + k); // out.println("square value: ");

	}

}
