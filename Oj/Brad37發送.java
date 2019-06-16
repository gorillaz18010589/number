package c;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Brad37發送 {

	public static void main(String[] args) {
		//UDP
		//pot號:65536  跟ip 
		//DatagramPacket 發送一定要有位置之inetadd
		//發送封包給老師
		String data ="Hello world";
		byte[]buf = data.getBytes();
	try {
		DatagramSocket socket = new DatagramSocket(); //先創建Socket 插座
		DatagramPacket packet = new DatagramPacket(   //創建封包
				buf, buf.length, 
				InetAddress.getByName("10.0.105.255"), //255是這個網域都可以收到
				8888);
		socket.send(packet);		//發送封包
		socket.close();
		System.out.println("OK");
	}catch (Exception e) {
		
	}
	}

}
