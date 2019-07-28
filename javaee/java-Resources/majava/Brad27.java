package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad27")
public class Brad27 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		response.setContentType("text/html; charset=UTF-8");
  		
  		//輸出動作
  		PrintWriter out = response.getWriter();
  		request.setCharacterEncoding("UTF-8"); //判定進來的直接為UTF-8
  		
  		HashMap<String, String>cookieMap = new HashMap<>();
  		
  		Cookie[] cookies= request.getCookies();
  		if(cookies !=null) {
  			
  		}
  	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
