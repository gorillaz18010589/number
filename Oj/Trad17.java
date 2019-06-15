package c;

public class Trad17 {

	public static void main(String[] args) {
		//比抽象還更抽象
		//interface骨子裡還是類別,在我們生活事物裡面,有些名稱名詞代表的意義,有點像規格
		//規格如果穩和到那你就是什麼,考認證考兩張證照有符合,就算,考認證方法很多完成規格就可以
		//方法都是抽象方法不會有定義,不用寫抽象因為全部都是
		//拜託你全世界都來做,所以都是public方法
		Trad171 obj1 = new Trad172();  //我要一個java認證師,但是肚子是抽象,用172實做
		obj1.m1(); obj1.m2(); //但看到的方法一樣是爸爸的方法
		Trad173 obj2 = new Trad172();
		
	}

}
interface Trad171{ //介面,只會告訴你要有什麼,方法你要自己實做
	void m1(); //沒有實作但骨子裡就是 abstract抽象,public
	void m2();	//拜託你全世界都來做,當然是public
}
class Trad172 implements Trad171,Trad173{ //implements 實做,他要把171抽象規格,實做出來
//		 Trad171,Trad173=>可以考多張證照
//		void m1() {} 一開始步行因為存取修是自小於爸爸
	public	void m1() {} //老爸存取修飾字是public,你要大於等於他
	public	void m2() {}
	public void m3(){}
	public void m4() {}
}
interface Trad173{ 
	void m3(); 
	void m4();	
}