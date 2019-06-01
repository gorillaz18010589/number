package tw.hank;

import myjava.*;

public class t_5 {

	public static void main(String[] args) {
		String s1 ="Brad";    //這是值
		String s2 ="Brad";    //肚子裝一樣的值所以相等,是相同物件
		System.out.println(s1 == s2);
		String s3 =new String("Brad"); //物件型別裝他所在的位置所以不相等==
		String s4 =new String("Brad");
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		Brad25 obj1 = new Brad25();
		Brad25 obj2 = new Brad25();
		System.out.println(obj1 == obj2);
		System.out.println(obj1,equals);
	}

}
