package c;

public class Brad04 {

	public static void main(String[] args) {
		String s1 =new String(); //�Ū���
		byte[] b1= {97,98,99,100}; 
		String s2 = new String (b1); //�নasci���X
		String s3 = new String (b1,1,2);  // �L�X0,1,2���� 1.2 =bc
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
