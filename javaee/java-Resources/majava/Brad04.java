package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad04")
public class Brad04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, //�H�a�Ӫ���T�b request
			HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("x");//����ѼƦ^��(STring)
		String y = request.getParameter("y");
		int intX, intY; 
		try {
			intX = Integer.parseInt(x);//�⮳�쪺x�ର���
			intY = Integer.parseInt(y);
		}catch(Exception e) {//�H�a�Ӷê���@00
			intX = intY = 0;
		}
		int intResult = intX + intY;
		
		response.setContentType("text/html; charset=UTF-8"); //�ͮĺ�������
		PrintWriter writer = response.getWriter(); //��y���o
		writer.append(intX + " + " + intY + " = " + intResult);
		writer.flush();
	}
}
