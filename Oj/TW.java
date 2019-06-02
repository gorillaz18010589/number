package c;

import org.graalvm.compiler.nodes.memory.MemoryAccess;

public class TW { //1.長度要10碼,2.第一馬英文,3,第二碼1或2,4.3~最後要數字
	private String id; //建構式是對已產生的物件初始化
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO"; //抓到地0個位值的英文
	//建構式 private static //static讓這code全家使用
	public TW(){  //對外營業有彈性
		this((int)(Math.random()*2) ==0); //產生亂數後不是0就是1 如果等於0往下走
	}
	//姓別
	public TW(boolean isMale) { 
		this(isMale,(int)(Math.random()*26)); //26個地區也固定
	}
	//地區
	public TW(int area) {   
		this((int)Math.random()*2==0,area); //地區是否固定
	}
	
	public TW(boolean isMale, int area ) {  //地區
//		String temp = letters.substring(area, area+1);  第一種方法
//		temp += isMale?"1":"2";
//		for (int i=0; i<7; i++) temp += (int)(Math.random()*10);
		
		StringBuffer sb = new StringBuffer(letters.substring(area, area+1)); 
		sb.append(isMale?"1":"2");
		for(int i=0; i<7; i++)sb.append((int)(Math.random()*10));
		
		String temp = sb.toString();
		for (int i=0; i<10; i++) {
			if (checkId(temp + i)) {
				id = temp + i;
				break;
			}
		}
	}
	
	private TW(String id) {
		this.id =id;
	}
	public static TW createTWId(String id) {
		TW temp = null;
		if (checkId(id)) {
			temp = new TW(id); 
		}
		return temp;
	}
	
//	this 朕,跟寶寶的觀念
//	public TW(String id) {  //地區
//		this.id = id; 
//	}
	
	public static boolean checkId(String id){	
		boolean ret = false;
		if (id.matches("[A-Z][12][0-9]{8}")) {//照1~32的排序
			char c0 = id.charAt(0); //charAT(0)抓到地0個位值的英文
			int n12 = letters.indexOf(c0)+10; //第一個位置從10開始所以加10
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
		
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 +
					n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			System.out.println(sum);
			ret = sum % 10 == 0;
		}
		
			return ret;	
	}	
	
	public String getId() { //動詞小寫
		return id;
	}
}
