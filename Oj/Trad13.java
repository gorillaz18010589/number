package tw.hank;

public class Trad13 {

	public static void main(String[] args) {
	
		Brad132 obj1 = new Brad132();
		obj1.m1();
		// Brad132  obj4 =new Brad131 要一台法拉利妳給我車 不行
		//多型我要車子你給我法拉利可以 ,但是我只功能只能看到車子功能,但效果是法拉利的效果
		
		
		//手機要我把資料庫連絡人繡上去,把聯絡人分三類*廠商*客戶*同事
		//要求在一個畫面都要看到,但資料位置有差異
		//都是聯絡人,分三格,在畫面上都呈現,但點進去,又只能看到自己東西,多型
		
		//同一個壞人定義都可以呼叫,但呼叫的方式看你是什麼壞人
	}

}

class Brad131{
	void m1() {System.out.println("Brad131:m1()");}
}								//爸爸進來的資料跟參數跟兒子一樣,輸入的資料還有return,改的話主要是內容
class  Brad132 extends Brad131{ //爸爸有的方法我要改寫,變好擴充,竟然要發揚光大,幹嘛所pravtie,要大於等於
	void m1() { //竟然繼承爸爸,爸爸一定有很重要的功能,所以要加super.m1(),把爸爸做完再做你的
		void m1()_
			System.out.println("Brad132:m1()");
		}
	
}

