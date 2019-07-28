package tw.brad.myjava;
//目的:創造兩個序號,互相在背景執行
//由42號來結束
//主序已經結束,但是背景還在執行
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Brad41
 */
@WebServlet("/Brad41")
public class Brad41 extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		Timer timer = new Timer(); //設定時間物件實體
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();
		timer.schedule(task1, 0, 1*1000); //設定時間間隔(物件,從0開始,幾秒)
		timer.schedule(task2, 0, 2*1000);
		
		HttpSession session = request.getSession();
		session.setAttribute("timer", timer);
		session.setAttribute("task1", task1);
		session.setAttribute("task2", task2);
		
		out.println("end");
		
	}
	
	class MyTask1 extends TimerTask {  //產生樂透執行緒1
		@Override
		public void run() {
			System.out.println("MyTask1 => " + (int)(Math.random()*49+1));
		}
	}
	class MyTask2 extends TimerTask {  //產生樂透執行緒2
		@Override
		public void run() {
			System.out.println("MyTask2 => " + (int)(Math.random()*49+1));
		}
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}