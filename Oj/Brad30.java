package c;

import java.io.FileWriter;

public class Brad30 {

	public static void main(String[] args) {
		//FileWriter 
		//Fileread
		//確定要讀寫文字資料的話可以用這個
	
	
	try {
		FileWriter writer = new FileWriter("dir1/brad.txt"); //創建一個資料夾
		writer.write("大家好,我是HANK"); //寫內容
		writer.flush();  //關掉錢沖掉
		writer.close(); //關掉
		System.out.println("OK沒有例外");
		}catch (Exception e) { //有例外的話跑下面
			System.out.println(e.toString());
		}
	}

}
