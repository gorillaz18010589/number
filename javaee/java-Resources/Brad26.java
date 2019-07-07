package tw.brad.myjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad26")
public class Brad26 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		//種cookie
		
		Cookie rememberMe = new Cookie("remember","true"); //設定cookie
		rememberMe.setMaxAge(1*60);//設定cookie最大時間60秒
		response.addCookie(rememberMe); //新增一個cookie
		
		Cookie account = new Cookie("account","hello"); //設定cookie
		rememberMe.setMaxAge(1*60);//設定cookie最大時間60秒
		response.addCookie(account); //新增一個cookie
		
		Cookie passwd = new Cookie("passwd","123456"); //設定cookie
		rememberMe.setMaxAge(1*60);//設定cookie最大時間60秒
		response.addCookie(passwd); //新增一個cookie
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
