package webNew;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	// public void doPost(HttpServletRequest req,HttpServletResponse res) throws
	// IOException
	// public void service(HttpServletRequest req,HttpServletResponse res) throws
	// IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		// Send Redirect technique....
		res.sendRedirect("sq");
		//res.sendRedirect("sq?k=" + k); // url rewriting......

		// requestDispatch method to call one servlet from another servlet.
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("sq");
		 * 
		 * rd.forward(req,res);
		 */
		// req.setAttribute("s", k);
		//res.getWriter().println("result is: "+ k);

	}

}
