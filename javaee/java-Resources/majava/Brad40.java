package tw.brad.myjava;
//跟執行緒有關
//這只有一個主序,讓你睡覺而已
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad40
 */
@WebServlet("/Brad40")
public class Brad40 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		int a = 0;
		while(true) { //骰子一擲骰,直到出現6就布要跑了
			a = (int)(Math.random()*6+1); //印出1-6
			out.print(a + "<br>"); //網頁看的到
			System.out.println(a); //cons看的到
			if(a==6) {
				out.print("game over");
				break;
			}else {
				try {
				Thread.sleep(1*100); //讓他睡一下不要跑太快
				}catch (Exception e) {
				
				}
			}
		}
	}

	
}
