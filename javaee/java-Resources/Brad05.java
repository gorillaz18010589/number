package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad05")
public class Brad05 extends HttpServlet {
	protected void doGet(HttpServletRequest request,
     			HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");//����ѼƦ^��(STring)
//		String hobby = request.getParameter("hobby");
//		System.out.println(hobby);
		
		String[] hobbys=request.getParameterValues("hobby"); //�o�ӭ�value�i�঳�a�h�ӭȥΦ���k�}�C�]�U�h
		for(String hobby:hobbys) {
			System.out.println(hobby);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		if(gender.equals("f")) {
			writer.append("�k��");
		}else {
			writer.append("�k��");
		}

		
		
		writer.flush();
	}

}
