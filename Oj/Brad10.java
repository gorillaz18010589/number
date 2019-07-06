package tw.brad.myjava;
//搭配9號程式
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
		
		
		//純粹輸出
		PrintWriter out = response.getWriter(); //輸出請求
		out.print("<div> i am Hank10 Page</div>");
		out.print(request.getParameter("name")); //拿你輸入name的參數
	
	}


}
