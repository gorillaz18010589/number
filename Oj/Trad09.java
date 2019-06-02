package tw.hank;

public class Trad09 {

	public static void main(String[] args) {
		String s1 = new String("Brad");
		String s2 = s1;
		System.out.println(s1 == s2);
		
		s1 += "OK";  // 因為加等於產生新的空間
		System.out.println(s1);
		System.out.println(s1==s2); //所以不相等

	}

}
