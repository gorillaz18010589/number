package c;

public class T21_陣列題目 {

	public static void main(String[] args) {
		int a=0;
		String[] mesg= {"OK","XX"};
		System.out.println(mesg[a]); 
		a = a ^ 1;    //異性相吸 0 ^ 1 =>1
		System.out.println(mesg[a]);
		a = a ^ 1; 	//同性相斥  1 ^ 1 => 0
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
	}

}
