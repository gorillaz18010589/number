package tw.brad.myjava;
//走分支路線
//好處是你看頁面原始碼是Brad09+Brad10
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//直接用URL灌進來
//輸出最單純,比較複雜都在request

@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//?name=xxx => doGet
	String name =request.getParameter("name");//得到參數接收請求
	
	RequestDispatcher dispatcher1 = request.getRequestDispatcher("Brad10"); //把你這個請求分支到Brad10
	RequestDispatcher dispatcher2 = request.getRequestDispatcher("brad11.html");
	
	response.setContentType("text/html; charset=UTF-8" );//一開始就要設定在串流還沒接之前就要做
	PrintWriter out = response.getWriter(); //輸出請求
	
	out.print("<h1>Brad Big Company</h1>");
	out.print("<hr>");
	out.print("I am \t"  + name);
	out.print("hr");
	
	
	dispatcher1.include(request, response); //一樣拿回到原始請求跟要求,即使你分支出去也會有你一開始的request, response
	out.print("<hr>");
	dispatcher2.include(request, response); //include()合在一起的概念
	}

	

}
