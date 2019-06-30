package tw.brad.myjava;
//�ݬy�{
//�ϥ�post��k�b�K�ݤ���,�ڭ̪����g�@�ӷs��
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�S���gAction�w�]get
//���g�ݧA�g��
@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	@Override  
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()");
//		super.service(req, resp); //�����t�d�ݧP�_�Odo get ,�٬Odo post
		doTask(req, resp);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

	//���Q�ޥL�̨��ۤv�g
	private void doTask(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doTask");
		PrintWriter writer = response.getWriter();
		writer.append("Hello cat");

	     //���orequest�A�������Ѽ�
		Enumeration<String> names = request.getParameterNames(); //���o�ӰѼ�
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			
			writer.append(name ="=" +value +"<br>");
		}
	}
	
}
