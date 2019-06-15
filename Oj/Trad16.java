package c;

public class Trad16 {

	public static void main(String[] args) {
		//抽象目的強迫多型
		//好處是我仍然保有我的方法,我m1寫得很好,你可以寫m2就好
		//建構式也可以用抽象
//		Trad161 obj1 = new Trad161; 因為抽象方法沒有辦法直接做出物件實體,等後代子孫把m2方法做出來
		Trad162 obj2 = new Trad162();
		Trad163 obj3 = new Trad163(2);
		obj2.m1(); obj2.m2(); obj2.m3();
		obj3.m1(); obj3.m2(); obj3.m3();
		Trad161 obj12 = new Trad162();
		obj12.m1(); obj12.m2();
		Trad161 obj13 = new Trad163(3);
		obj13.m1(); obj13.m2();
		
	}

}
abstract class Trad161{//肚子傭有抽象方法裡面也要有
	Trad161(int a){}
	void m1() {System.out.print("Trad162:m1()");}
	abstract void m2();//有這個方法存在,此時不說抽象方法,不清不楚當然沒有物件實體
}
abstract class Trad162 extends Trad161{ //爸爸有抽象方法,所以前面加abstract可以這是方法1
	Trad162(){super(2);}
	void m2() {System.out.print("Trad162:m2()");}	
	void m3() {System.out.print("Trad162:m3()");}	
}
class Trad163 extends Trad161{ //爸爸有抽象方法,所以前面加abstract可以這是方法1
	Trad163(){super(2);}
	void m2() {System.out.print("Trad163:m2()");}	
	void m3() {System.out.print("Trad163:m3()");}	
}
abstract class Trad164{ //肚子是方法,但我class還是可以掛abstract
	void m4() {}
	void m5() {}
}