package c;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad39 {

	public static void main(String[] args) {
	//ServerSocket 跟Socket
	//TCP
	//先玩用戶端只要SOCKET就可以
	//寫一個迴圈 從0~65535看哪一個pot願意跟你講話,有願意就可以進去
	//http相同網段,就明碼的帳號密碼都查的到
	//39用乎端發送端
	
	try {
		Socket socket =  new Socket(InetAddress.getByName("10.0.105.82"),7777); //80號pot有開願意跟我們講話
																				//7777pot號
		OutputStream out = socket.getOutputStream();
		out.write("hello".getBytes());
		out.flush();
		socket.close();
		System.out.println("OK");
	}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
