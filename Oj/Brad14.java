package tw.brad.myjava;
//Controller(控制器)

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad14")
public class Brad14 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		//0.prepare(準備) *Controller(控制器) 把你的request根 response準備在此
		String x = request.getParameter("x"); 
		String y = request.getParameter("x");
		if(x == null) x ="0"; //如果你輸入的值是讓你數值為0,方便去處理
		if(y == null) y ="0";
		
		//1.model (寫Brad15) //演算法另外寫class
		Brad15 model = new Brad15(x,y); //物件實體化叫出model
		int result = model.add();  //model的add()方法算出X + Y演算,存入在result
		
		
		//2. View 效果畫面暫時寫在Brad16
		String pline = String.format("Brad16?x=%s&y=%s&result=%s",
				x,y,result);
		RequestDispatcher rd = 
			request.getRequestDispatcher(
				pline);
		rd.forward(request, response);

				
	}
}
