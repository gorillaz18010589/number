package tw.brad.myjava;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad08
 */
@WebServlet("/Brad08")
public class Brad08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	ServletContext context =getServletContext(); //���o�@�Ӵx�ަ��A������������
	String uploadPath = context.getInitParameter("uploadPath");
	System.out.println(uploadPath);
	
	//���C:/Users/admin/eclipse-workspace/Bradjava/MyjavaEE/WebContent/upload (web.xml)
	
	
	
	}
}
