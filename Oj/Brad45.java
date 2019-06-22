package c;
//目標查詢叫安全
//sql => PreparedStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;

public class Brad45 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //自動載入驅動程式(java8以後可以不用) https://dev.mysql.com/doc/connector-j/8.0/en/
			//第三招 (建議使用這招清楚不容易出錯)
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/cust",prop);
			
			//明碼保護新增資料方式
//			PreparedStatement pstmt = conn.prepareStatement(
//					"INSERT INTO brad(cname,tel,birthday)VALUES(?,?,?)");
//			pstmt.setString(1, "Allen"); //設定第一個是allen
//			pstmt.setString(2, "222");
//			pstmt.setString(3, "1909-09-08");
//			pstmt.executeUpdate();
			
			//迴圈方式新增
			PreparedStatement pstmt = conn.prepareStatement(
			"INSERT INTO brad(cname,tel,birthday)VALUES(?,?,?)");
			for(int i=0; i<10; i++) {
			pstmt.setString(1, "Allen" + (int)(Math.random()*100)); 
			pstmt.setString(2, "222");
			pstmt.setString(3, "1909-09-08");
			pstmt.executeUpdate();
			}	
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}