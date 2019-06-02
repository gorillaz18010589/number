package tw.hank;

import c.TW;

public class t_6 {

	public static void main(String[] args) {
//		String a ="A123456789".substring(0,1);
//		String letters = "ABCDEFIGHG";
//		if (letters.contains(a)) {
//			System.out.println("exist");
//		}
//		
		TW id1 = new TW();
		TW id2 = new TW(false);
		TW id3 = new TW(4);
		TW id4 = new TW(true,17);
		TW id5 = TW.createTWId("H12359d585");
		
		if(TW.checkId("H123594585")) { 
			System.out.println("OK");
			
		}else {
			System.out.println("XX");
		}
	}
}