package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Brad12
 */
@WebServlet("/Brad12")
public class Brad12 extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8" );//�@�}�l�N�n�]�w�b��y�٨S�����e�N�n��
		PrintWriter out = response.getWriter(); //��X�ШD
		
	RequestDispatcher dispatcher =	request.getRequestDispatcher("Brad13");//��A�o�ӽШD�����Brad13
		
		out.print("<h1>hank Big Brad12</h1>");
		
		String	name = request.getParameter("name");
		
		if(name == null) {  //�ѼƨS���N�Onull,�p�G�S���a�ѼƮ�
//			out.print("null");
			dispatcher.forward(request, response);//forward�O��ӳ��X�h,�s����Brad13
		}else {
			out.println(name);
		}
	}

	

}
