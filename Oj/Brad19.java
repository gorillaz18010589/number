package c;

public class Brad19 {

	public static void main(String[] args) {
		//在你數學的幾何形狀都應該算的出周長,三角型,正方形

	}
	static void m1(Shape s) { //你想要呼叫這個形狀都可以進來,可以指定子孫的特定方法進來就好
		//它們通通都是形狀,那形狀都可以寫面積,不用一個一個來
		//你只要給我怪物shape進來就可以,執行看你實做的怪物技能而不同
		s.calArea();
	}
}
interface Shape{
	void calLength(); //周長
	void calArea(); //形狀
}
class Triangle implements Shape{ //三角形實做
	public void calLength() {}
	public void calArea() {}
}
class Rectangle implements Shape{ //矩形實做
	public void calLength() {}
	public void calArea() {}
}
class Circle implements Shape{ //圓型實做
	public void calLength() {}
	public void calArea() {}
}