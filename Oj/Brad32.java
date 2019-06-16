package c;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.function.IntPredicate;

public class Brad32 {

	public static void main(String[] args) {
		//從excel上抓取資料
		//FileInputStream => InputStreamReader =>  BufferedReader
//		FileInputStream fin = new FileInputStream(""); //一根串一根
//		InputStreamReader ir = new InputStreamReader(fin);
//		BufferedReader br = new BufferedReader;
		//	BufferedReader =>readLine()
		//物件序列化,讓物件可以輸出輸入多好
		// ObjectOutputStream =>	writeObject(Object obj)
		//ObjectInputStream => readObject()
		try {
			BufferedReader br =
				new BufferedReader(
					new InputStreamReader(
							new FileInputStream("dir1/Book1.csv")));
			String line = null; //從一根一根水管得到BufferedReader的檔案,他是字串就可使用readLine()這招
			while((line = br.readLine()) !=null) { //readLine()當null時停止,所以!=(不等於)null時做以下的事情
				String[]row  = line.split(","); //得到的檔案逗號本來有用字串切割割掉
				System.out.println("Name:" + row[0]); //0的位置印出名子以此類推
				System.out.println("ID:" + row[1]);
				System.out.println("Birthday:" + row[2]);
				System.out.println("Age:" + row[3]);
				System.out.println("-----------");
			}
		}catch (Exception e) {
			
		}
		
	}

}
