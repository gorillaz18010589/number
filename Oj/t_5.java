package tw.hank;

import myjava.*;

public class t_5 {

	public static void main(String[] args) {
		String s1 ="Brad";    //�o�O��
		String s2 ="Brad";    //�{�l�ˤ@�˪��ȩҥH�۵�,�O�ۦP����
		System.out.println(s1 == s2);
		String s3 =new String("Brad"); //���󫬧O�˥L�Ҧb����m�ҥH���۵�==
		String s4 =new String("Brad");
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		Brad25 obj1 = new Brad25();
		Brad25 obj2 = new Brad25();
		System.out.println(obj1 == obj2);
		System.out.println(obj1,equals);
	}

}
