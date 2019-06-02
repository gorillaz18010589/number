package tw.hank;

public class Trad12 {

	public static void main(String[] args) {
		//相同名稱,參數不同就是overflow
		
		String[] ns = {"brad","hank","cc"};//用陣列一次跟多人打招呼
		Brad121 obj1 = new Brad121();
//		obj1.m1(); 
//		obj1.m1((byte)2);
		obj1.m1((byte)2);
		obj1.sayYa("Bard");
//		obj1.sayYa(ns);  跟陣列多人打招呼
		obj1.sayYa("Brad");
	}
}
class	Brad121{
	void m1() {System.out.println("Brad121:m1");}
	byte m1(byte a) {
	 {System.out.println("Brad121:m1(byte)");}
	return (byte)1;
	}
	void m1 (int a) {System.out.println("Brad121:m1(int)");}
	void m1 (byte a, int b) {System.out.println("Brad121:m1(byte,int)");}
	void m1 (int a,byte b) {System.out.println("Brad121:m1(int,byte)");}
	void sayYa(String name) {System.out.println(name + ",ya!");}
//	void sayYa(String[] names) {
//		for (String name:names) System.out.println("Ya," +name);		
//		}
	void sayYa(String...  names){
		for (String name:names) System.out.println("Ya," +name);		
		}
	
}
