package c;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad42 {

	public static void main(String[] args) {
		//網路資料同時接收,內不輸出同時輸出
	try {	
		ServerSocket server = new ServerSocket(9487);
		Socket socket = server.accept();
		
		//外部輸入接收
		BufferedInputStream bin =
				new BufferedInputStream(socket.getInputStream());
		//內部輸出
		BufferedOutputStream bout =
				new BufferedOutputStream(new FileOutputStream("dir2/brad.jpg"));
		
		int len; byte[] buf = new byte[1024*4096];
		while((len = bin.read(buf)) !=-1) {
			bout.write(buf,0,len);
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}		
	}

}
