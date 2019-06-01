package c;

public class T22_BIKE {

	public static void main(String[] args) {
		bike b1 = new bike();
		System.out.println(b1.getSpeed());
		
		for(int i=0; i<=13; i++) {
			b1.upSpeed(); 
		}
//		System.out.println(b1.speed);
		System.out.println(b1.getSpeed());
	}
}
