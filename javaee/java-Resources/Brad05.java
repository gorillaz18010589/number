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
		String gender = request.getParameter("gender");//收到參數回傳(STring)
//		String hobby = request.getParameter("hobby");
//		System.out.println(hobby);
		
		String[] hobbys=request.getParameterValues("hobby"); //這個值value可能有帶多個值用此方法陣列跑下去
		for(String hobby:hobbys) {
			System.out.println(hobby);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		if(gender.equals("f")) {
			writer.append("女生");
		}else {
			writer.append("男生");
		}

		
		
		writer.flush();
	}

}
