package tw.brad.myjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad13
 */
@WebServlet("/Brad13")
public class Brad13 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().print("<h2> §A¬O½Ö?? </hr>");
	}

	

}
