package c;
//增刪修查 =>增刪修叫更新資料
//查指示查詢
//老師自己定義的寫小寫,SQL全寫大寫
//java.sql=>DriverManager=>	getConnection(String url) 
//java.sql=> ResultSet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;

public class Brad44 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //自動載入驅動程式(java8以後可以不用) https://dev.mysql.com/doc/connector-j/8.0/en/
			
			//第一種連線方式 (可以加&但容易打錯)
//			Connection conn = DriverManager.getConnection( //連接你sql資料庫
//					"jdbc:mysql://localhost:3307/cust"+
//					"?user=root&password=root&serverTimezone=Asia/Taipei");
//			//第二招連線方式 (彈性太差)
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei","root","root");
			
			//第三招 (建議使用這招清楚不容易出錯)
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/cust",prop);
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate( //下達mysql指令
				"INSERT INTO brad (cname,tel,birthday) VALUES ('Jennifer','555','1992-03-27')");
			
			//查詢 :移動指標把資料拿出來
			//布用管理面型別你想怎麼玩就怎麼叫
			//下對語法撈東西 ,要演算給資料庫去算比較快
			ResultSet rs =stmt.executeQuery("SELECT*FROM brad");
			
			while (rs.next()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				System.out.println(id +":" + cname  +":" +tel +":" +birthday);
			}
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}