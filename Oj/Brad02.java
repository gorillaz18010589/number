package tw.brad.myjava;
//看流程
//使用post方法帳密看不到,我們直接寫一個新的
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//沒有寫Action預設get
//有寫看你寫誰
@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	@Override  
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()");
//		super.service(req, resp); //爸爸負責看判斷是do get ,還是do post
		doTask(req, resp);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

	//不想管他們兩位自己寫
	private void doTask(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doTask");
		PrintWriter writer = response.getWriter();
		writer.append("Hello cat");

	     //取得request你的網頁參數
		Enumeration<String> names = request.getParameterNames(); //抓到這個參數
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			
			writer.append(name ="=" +value +"<br>");
		}
	}
	
}
