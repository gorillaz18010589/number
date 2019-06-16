package c;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.InflaterInputStream;
	
public class Brad43 {

	public static void main(String[] args) {
		//網頁看到德是最後結果
		//抓網頁的code
		
	try {	
		//pdf網頁版
		URL url = new URL("https://pdf");
		HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
		conn.connect();//取得連線
		
		//取得串流,把串流轉成buff
		BufferedInputStream bin = 
			new BufferedInputStream(conn.getInputStream());
		
		//輸出串流,輸出到我們資料夾
		BufferedOutputStream bout = 
			new BufferedOutputStream(new FileOutputStream("dir1/yahoo.jpg"));
		
		int len; byte[] buf = new byte[4096]; //物件黨要陣列4096大小
		while ( (len = bin.read(buf)) != -1) {  //獨黨如果不是1舊存進去  跑下面
			bout.write(buf, 0, len); //把buf物件寫出來,從0開始,一次跑的長度看你
		}
		bout.flush();
		bout.close();
		bin.close();
		
		System.out.println("OK");
	} catch (Exception e) {
		System.out.println(e.toString());
	}
}
}
////要取得網頁文字資料
//BufferedReader reader =
//		new BufferedReader(new InputStreamReader(conn.getInputStream()));
//String line = null; int i =1;
//while((line = reader.readLine()) != null) {
//	System.out.println(i++ + ":" +line);
//}
//reader.close();
//
//conn.getInputStream(); //輸入資料
