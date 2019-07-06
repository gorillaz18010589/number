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
		response.setContentType("text/html; charset=UTF-8" );//一開始就要設定在串流還沒接之前就要做
		PrintWriter out = response.getWriter(); //輸出請求
		
	RequestDispatcher dispatcher =	request.getRequestDispatcher("Brad13");//把你這個請求分支到Brad13
		
		out.print("<h1>hank Big Brad12</h1>");
		
		String	name = request.getParameter("name");
		
		if(name == null) {  //參數沒有就是null,如果沒有帶參數時
//			out.print("null");
			dispatcher.forward(request, response);//forward是整個都出去,連接到Brad13
		}else {
			out.println(name);
		}
	}

	

}
