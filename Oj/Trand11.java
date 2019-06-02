package tw.hank;

public class Trand11 {

	public static void main(String[] args) {
//		Trad111 obj1 = new Trad111();
//		Trad111 obj2 = new Trad111();
		Trad112 obj3 = new Trad112();
	}


}

class Trad111{ 
	Trad111(){
		this(2); //先叫下面
		System.out.println("Trad111()");
	}
	
	Trad111(int a){ //再叫下面
		this(3,4);
		System.out.println("Trad111(int)");
	}
	
	Trad111(int a,int b){ 
		System.out.println("Trad111(int,int)");
	}
}

 class Trad112 extends Trad111{ //爸爸們先進來,
	 static int a; //共同傭有的值,static的事早就處理完畢,不要濫用'
	 int b = 0;
	 Trad112(){  //建構式早就在,進行建構是初始話指示改值;
	 System.out.println("Trad112()");
	 }
	 
	 {
		System.out.println("Brad1112{*}:"+b);
	 }
	 static {
		 System.out.println("Brad1112{*}:2"); // static 早就進來了 所以先執行,再來執行爸爸,爸爸完建構式,再來改值得112()
		 
	 }
 }