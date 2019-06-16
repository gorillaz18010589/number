package c;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad33 {

	public static void main(String[] args) {
		//(4) 宣告成績屬性
		Student s1 = new Student(90, 100, 87);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		//java.io.Serializable;
		//(3)拋出例外
		try { //(1)創建資料夾
			FileOutputStream fout = new FileOutputStream("dir1/brad.object");//創造一個物件檔案放在這資料夾
			ObjectOutputStream oout = new ObjectOutputStream(fout);//把資料夾放在物件裡
			//(2)(衝跟關)
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
//整個物件進行序列化的動作
//一個物件要能夠被序列化,必須該列被宣告可實做序列化這件事情
class Student implements Serializable{ //只需要宣告就可以,可序列化
	int ch;
transient	int math; //只有數學成績不要序列化transient,屬性不想要備序列化可以用
	int eng;
	Student(int ch, int math, int eng){this.ch = ch; this.math =math; this.eng = eng;}
public	int sum() {return ch+math+eng;}
public	double avg() {return sum()/3.0;}
}