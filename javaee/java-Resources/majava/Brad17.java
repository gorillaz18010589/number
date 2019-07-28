package tw.brad.myjava;
//連結資料庫
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //連接mysql
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	

}
