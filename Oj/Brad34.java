package c;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.function.ObjIntConsumer;

public class Brad34 {

	public static void main(String[] args) {
		//解33檔案序列化
		//讀入黨案
		//屬性才是物件最重要的,方法都依樣差異在屬性
		try {
			ObjectInputStream oin = 
					new ObjectInputStream(new FileInputStream("dir1/brad.object"));
				Object obj = oin.readObject();
				Student s1 = (Student)obj;
				oin.close();
				
				System.out.println(s1.sum());
				System.out.println(s1.avg());
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}