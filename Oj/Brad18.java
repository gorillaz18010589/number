package c;

public class Brad18 {

	public static void main(String[] args) {
	

	}
	static void test1( Brad181 obj) {
		obj.m1(); //因為我只想做m1()方法,抽象方法幫我把規則做了,後面兒子只要去做你想做的m1方法
	}
}
interface Brad181{
	void m1(); void m2();
}
abstract class Brad182 implements Brad181{
	public void m1() {}
	public void m2() {}
} 
class Brad183 extends  Brad182{


}

interface Brad185{
	void m3();
}

interface Brad186 extends Brad181,Brad185{ //介面我繼續把這兩個方法方陽光大
	void m4();
}