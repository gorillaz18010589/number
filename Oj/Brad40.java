package c;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad40 {

	public static void main(String[] args) {
	//TCP
	//seversocket 40接收端
	try{	
			ServerSocket server = new ServerSocket(7777);//80 ,7777
			Socket socket = server.accept(); //有沒有聽到等候中
			
			InetAddress urip = socket.getInetAddress(); //得到你的ip
			InputStream in = socket.getInputStream(); //你輸入的串流
			
			int len; byte[] buf = new byte[4096];
			while((len = in.read(buf)) !=-1) {
				System.out.println(urip.getHostAddress() + ":" +
								new String(buf,0,len));
			}
				in.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
