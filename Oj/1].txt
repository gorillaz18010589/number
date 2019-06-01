package c;

public class bike { //method 方法 =function
//	(1)	double speed; //屬性 Field 
//	private	double speed; //封裝,速度看不到加上priver變私有的外面人看不到,讓我們無法任意變更速度,只能透過方法
	//has -a member成員:obj.member;
	protected double speed; //保護級 可以讓子繼承修改
	
//建構式 constructor
	// public bike(){} 沒有回傳值
//初始化
	public bike(int a) { 
		speed =a;
		System.out.println("bike()");
	}
//	
public	void upSpeed() { //創造一個加速度的函式 保護級對外營業使用
		speed = speed<1 ? 1:speed*1.2; //速度<1時 速度1,其他情況*1.2
	}
public	void downSpeed() {
		speed = speed<1 ? 0: speed*0.7; //速度<1時 速度0,其他情況*0.7
	}
public	double getSpeed() {  //回傳速度值,顯示速度
		return speed;     
	}
}

//class Scooter extends bike{  //class(創造) Scooter= (小綿羊 ) extends =>(繼承,延伸,發揚光大)
//	private boolean light; //創造一個登
//	boolean isLight() {return light;} //檢查有沒有開燈,一開始是亮的
//	void switchLight() {light =!light;} //開關燈按鈕, 開燈不相等就是關燈
//	
//	void upSpeed() {
//		speed = speed<1 ? 1:speed*2.4;  // 父親腳踏車有設定private,所以
	
