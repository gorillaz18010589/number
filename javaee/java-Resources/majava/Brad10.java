package tw.brad.myjava;
//�f�t9���{��
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad10")
public class Brad10 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		//�º��X
		PrintWriter out = response.getWriter(); //��X�ШD
		out.print("<div> i am Hank10 Page</div>");
		out.print(request.getParameter("name")); //���A��Jname���Ѽ�
	
	}


}
