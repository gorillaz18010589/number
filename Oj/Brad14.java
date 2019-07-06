package tw.brad.myjava;
//Controller(���)

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad14")
public class Brad14 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		//0.prepare(�ǳ�) *Controller(���) ��A��request�� response�ǳƦb��
		String x = request.getParameter("x"); 
		String y = request.getParameter("x");
		if(x == null) x ="0"; //�p�G�A��J���ȬO���A�ƭȬ�0,��K�h�B�z
		if(y == null) y ="0";
		
		//1.model (�gBrad15) //�t��k�t�~�gclass
		Brad15 model = new Brad15(x,y); //�������ƥs�Xmodel
		int result = model.add();  //model��add()��k��XX + Y�t��,�s�J�bresult
		
		
		//2. View �ĪG�e���Ȯɼg�bBrad16
		String pline = String.format("Brad16?x=%s&y=%s&result=%s",
				x,y,result);
		RequestDispatcher rd = 
			request.getRequestDispatcher(
				pline);
		rd.forward(request, response);

				
	}
}
