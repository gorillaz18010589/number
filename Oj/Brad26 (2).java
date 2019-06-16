package c;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad26 {

	public static void main(String[] args) {
		try {
			FileInputStream fin=
					//utl8暫3個byte
//					new FileInputStream("dir1/file3"); //開串流沒找到資料夾
					new FileInputStream("dir1/file2");
//					//英文字讀法
//					int c;
//					while((c = fin. read()) != -1){//先問問是不是-1 不是-1我才要完,是-1脫離迴圈
////					System.out.println(c); 印出數字
//					System.out.print((char)c); //收到int數字轉成char字元
//					}
			
					//陣列中文讀法			
				int len; byte[] buf= new byte[3];
				while ( (len = fin.read(buf)) != -1) {
					System.out.print(new String(buf,0,len));
				}
			
					fin.close();
					System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		
		}catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
