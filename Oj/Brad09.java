package tw.brad.myjava;
//��������u
//�n�B�O�A�ݭ�����l�X�OBrad09+Brad10
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//������URL��i��
//��X�̳��,����������brequest

@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//?name=xxx => doGet
	String name =request.getParameter("name");//�o��ѼƱ����ШD
	
	RequestDispatcher dispatcher1 = request.getRequestDispatcher("Brad10"); //��A�o�ӽШD�����Brad10
	RequestDispatcher dispatcher2 = request.getRequestDispatcher("brad11.html");
	
	response.setContentType("text/html; charset=UTF-8" );//�@�}�l�N�n�]�w�b��y�٨S�����e�N�n��
	PrintWriter out = response.getWriter(); //��X�ШD
	
	out.print("<h1>Brad Big Company</h1>");
	out.print("<hr>");
	out.print("I am \t"  + name);
	out.print("hr");
	
	
	dispatcher1.include(request, response); //�@�ˮ��^���l�ШD��n�D,�Y�ϧA����X�h�]�|���A�@�}�l��request, response
	out.print("<hr>");
	dispatcher2.include(request, response); //include()�X�b�@�_������
	}

	

}
