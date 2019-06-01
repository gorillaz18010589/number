package c;

public class TW { //1.長度要10碼,2.第一馬英文,3,第二碼1或2,4.3~最後要數字
	private String id; //建構式是對已產生的物件初始化
	//建構式
	public TW(){ 
		
	}
	//姓別
	public TW(boolean isMale) { 
		
	}
	//地區
	public TW(int area) { 
		
	}
	
	public TW(boolean isMale, int area ) {  //地區
		
	}
//	this 朕,跟寶寶的觀念
//	public TW(String id) {  //地區
//		this.id = id; 
//	}
	
	public static boolean checkId(String id){	
		boolean ret = false;
		if(id.length() == 10) {
		}
			return ret;	
	}	
	
	public String getId() { //動詞小寫
		return id;
	}
}
