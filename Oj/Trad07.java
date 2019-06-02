package tw.hank;

public class Trad07 {

	public static void main(String[] args) {
	String test = "A123456789";	//matches()是否符合的意思    
		if(test.matches("[a-zA-Z][12][0-9]{8}")) { // [A-Z]中括號以內的才要//^相反的意思
			System.out.println("OK"); //[0-9] {8} [0-9]做8次的意思
		}else {
			System.out.println("XX");
		}

	}

}
