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

	protected void doGet(HttpServletRequest request, //人家來的資訊在 request
			HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("x");//收到參數回傳(STring)
		String y = request.getParameter("y");
		int intX, intY; 
		try {
			intX = Integer.parseInt(x);//把拿到的x轉為整數
			intY = Integer.parseInt(y);
		}catch(Exception e) {//人家來亂的當作00
			intX = intY = 0;
		}
		int intResult = intX + intY;
		
		response.setContentType("text/html; charset=UTF-8"); //生效網頁標籤
		PrintWriter writer = response.getWriter(); //串流取得
		writer.append(intX + " + " + intY + " = " + intResult);
		writer.flush();
	}
}
