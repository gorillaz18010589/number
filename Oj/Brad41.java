package c;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad41 {

	public static void main(String[] args) {
		//傳送圖片發送端結合IO
		//先把資料讀完再一次發送
		//自訂通訊協定
		//41號發送42號接收
		
		try {
			File file = new File("dir1/coffe1.jpg"); //把dir1的照片
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream(file));
			byte[] buf = new byte[(int)file.length()];
			bin.read(buf);  //讀資料
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName("10.0.105.35"),9487); //網路連線
			BufferedOutputStream bout =
					new BufferedOutputStream(socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			socket.close();
			System.out.println("send OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
