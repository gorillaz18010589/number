package c;

public class Brad21 {

	public static void main(String[] args) {
		Brad211 obj1 = new Brad211();
		Brad211.Brad212 obj2 =  obj1. new Brad212(); //宣告外面裡面的內部,要有這個obj1才會有他再給他212車子
		Brad211.Brad213 obj3 =  new Brad211.Brad213();     //static不需要物件就可以用,所以不需要obj1就可以幹
		obj1.m1();
		obj2.m2();
		//內部類別
		//想像外部是一個工廠,工廠裡面還有工廠
		//方便存取外部的屬性跟方法
		//什麼時候會這樣寫,我們會透過內部類別來將外部的物件實體做出來
		//身分證最後那招是傳字串,一定要字串
		//內部類別分常常用
		
	}

}
class Brad211{ //想像外部是一個工廠
	private  int a;
	private static int b;
	
	private static Brad211(obj){ //私人也可用叫得˙到
		
	}
	void m1() { //這個工廠有做m1()輪胎
		a = 10;
		System.out.println("Brad211:m1()");
	}
	
	class Brad212{ //類別中的類別,內部類別,裡面還有一個工廠
		void m2() { //你在裡面的工廠因為都在工廠裡面所以m1方法你可以使用,直接用自己工廠做的輪台
			System.out.println(a);
			m1(); //使用自己工廠的輪胎m1()
//			Brad211.this.m1(); //如果你要呼叫的m1()方法一樣,用this代表本類別的外部的m1()
			System.out.println("Brad212:m2()");
		}
	}
	

	static class Brad213{ // static也可以
		void m1() {
			System.out.println("Brad213:m1()" + b);
		}
		Brad211 createBrad211() { //
			Brad211 obj = new Brad211();
			return obj;
		}
	}
}