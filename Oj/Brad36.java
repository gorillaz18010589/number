package c;

import java.net.Inet4Address;
import java.net.InetAddress;

public class Brad36 {

	public static void main(String[] args) {
	try {
		//得到ip位置主機名稱 host =>www(名稱).iii.org.tw網域 
		//url:http(通訊協定)://(主機名稱)
		//如果自己沒有查到網址,DNS回報不認識
		//www.microsoft.com 只要有一個人問,就快取,公用ip只會在一台主機上面,因為
		//通訊協定:TCP,udp,TCMP
		//再來玩udp
		//DatagramSocket建立一個插座,先找到差做才有電流傳送過來
//	 InetAddress ip = InetAddress.getByName("www.google.com");//得到單一資策會的主機名稱,查自己得電腦有沒有這個網域名稱
		
		//查詢這個網域所有的ip
	 InetAddress[] ips = InetAddress.getAllByName("www.google.com");
	 for(InetAddress ip :ips) {
		 System.out.println(ip.getHostAddress());
	 }
	}catch (Exception e) {
		System.out.println(e.toString());
	}
	}

}
