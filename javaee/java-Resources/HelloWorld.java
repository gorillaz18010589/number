package tw.brad.myjava;
//doGet =>一般的URL
//doPost => 兩種特性資訊隱藏,檔案上傳
//如果物件重來沒有被人發生過,伺服器會將該類別產生出來的物件實體,後來會利用他服務大眾
//只有一個物件在服務全世界
//在sever李建構是比較沒意義
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld") //指定在外面user端是用這個方式來存取的名稱
public class HelloWorld extends HttpServlet { //實際類別在這邊,永遠繼承 HttpServlet
	private static final long serialVersionUID = 1L; //普通宣告提醒要不要利用這個當成我的版本序號
	private int a;
	private static int b;
    public HelloWorld() { //建構式
        super();
        System.out.println("Helooworld();");
    }
    //拿人家的請求做出回應
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		a++; b++;
		System.out.println("doGet()");
		response.setContentType("text/html; charset=UTF-8"); //設定HTML格式,中文
		response.getWriter().append("Served at: ")
		.append(request.getContextPath())
		.append("<h1>Hello,World</h1>");  //新增HTML hi字體
	}
	//檔案上傳,隱藏資訊
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
