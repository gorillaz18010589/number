package c;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad38 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		//netstac /na 
		//UDP
	while(true) {
		try {
			DatagramSocket socket = new DatagramSocket(8888); //建立Socket(8888pot)
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("接收之前");
			socket.receive(packet); //接受方法 ,看到receive會在這等候接受
			System.out.println("接收之後");
			socket.close();
			System.out.println("receive ok");
			
			//取得對方的ip
			InetAddress urip = packet.getAddress(); //取得對方ip
			int len =packet.getLength(); //封包長度
			byte[] data = packet.getData(); //得到封包的資料
			System.out.println(urip + ":" + new String(data,0,len));
		}catch (Exception e) {
		}
	}
	}

}
