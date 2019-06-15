package c;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad25 {

	public static void main(String[] args) {  
		String str ="hello,資策會\n";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2",true); //串流打開創造一個文件檔
			fout.write(97); //97就是a的asic碼
			
			//陣列方法
			byte[] cont = {97,98,99,100};
//			fout.write(cont);
			fout.write(str.getBytes());
			fout.flush(); //最好做這個像隨身碟依樣把資料衝出去
			fout.close();   //關掉
			System.out.println("OK");
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}catch(IOException e) {
			System.out.println(e.toString());
		}

	}

}
