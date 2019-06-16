package c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad29 {

	public static void main(String[] args) {
		//只能Call 2G的檔案
		//很大的臉蓬跟檔案依樣大一次獨去,read全部
		//拿陣列outputstime
		long start = System.currentTimeMillis(); //設定初始時間
		//獨檔案
	try {	
		File source = new File("dir1/coffe1.jpg"); //照片所在目錄
		FileInputStream fin = new FileInputStream(source);
		byte[] buf = new byte [(int)source.length()]; //獨在一個跟檔案依樣大的buf
		fin.read(buf);
		fin.close();
		System.out.println("完成讀檔");
		
		//輸出串流
		FileOutputStream fout = new FileOutputStream("dir2/coffe1.jpg");
		fout.write(buf);
		fout.flush();
		fout.close();
		System.out.println("寫完成檔案");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
