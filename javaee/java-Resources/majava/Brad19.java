package tw.brad.myjava;
//Brad17後面的資料庫

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.berry.BCrypt;


@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");//使用此語法
		PrintWriter out = response.getWriter(); //輸入
		
		String account = request.getParameter("account"); //取得帳號參數
		String passwd = request.getParameter("passwd");   
		String realname = request.getParameter("realname");
		
		if(account == null)return; //如果你是從url帳號填寫表單會是null回傳空白
		
		//用已經加密的api別人寫的
		String passwd2=BCrypt.hashpw(passwd, BCrypt.gensalt());
		String ret = toMySQL(account, passwd2, realname);
		out.print(ret);
		out.flush();
//		out.print(passwd +"<br>"); //一般密碼
//		out.print(passwd2 +"<br>");//使用加密的密碼
//		out.print(passwd2.length());//顯示密碼長度資料庫夠不夠
		
//		out.print(account + ":" + passwd +":" + realname); //檢查帳號
	}

	private String toMySQL(String account, String passwd, String realname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Properties prop = new Properties();
			prop.put("user", "root"); //輸入帳號
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/iii", prop);
			String sql = 
				"INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			pstmt.setString(2, passwd);
			pstmt.setString(3, realname);
			int count = pstmt.executeUpdate();
			return "Affected: " + count;
		}catch(Exception e) {
			//System.out.println(e.toString());
			return e.toString();
		}		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);//跑道post再進來這,你去做doget
	}
	
	//自寫的讓doget跟dopost都在這做
//	private void doBrad(HttpServletRequest request, HttpServletResponse response) {//寫一個方法管你前端do什麼都做這個方法
//		
//	}

}
