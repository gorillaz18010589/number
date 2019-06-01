package c;

public class Brad04 {

	public static void main(String[] args) {
		String s1 =new String(); //空物件
		byte[] b1= {97,98,99,100}; 
		String s2 = new String (b1); //轉成asci號碼
		String s3 = new String (b1,1,2);  // 印出0,1,2中個 1.2 =bc
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
