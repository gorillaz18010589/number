package c;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad28 {

	public static void main(String[] args) {
		//用陣列方式來讀取資料
		//抓到後用長度輸出資料
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = //輸入串流
					new FileInputStream("dir1/coffe1.jpg");
			FileOutputStream fout = //輸出串流
					new FileOutputStream("dir2/coffe1.jpg");
			int len; byte[]buf = new byte[4096]; //用長度來抓讀取資料
			while ((len = fin.read(buf))!=-1) { //從串流道buf讀到多少,4096不等於-1
				fout.write(buf,0,len); //再拜託outstrimme做出輸出動作
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("結束");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
				System.out.println(System.currentTimeMillis());
		}

	}
