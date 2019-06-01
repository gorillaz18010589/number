package c;


public	class  mot extends bike{  //public 公開對外營業 extends //繼承
	private boolean light; //創造一個登
	//第一件是初始話妳爸爸,
	public mot() {
		// super(); 父類別,繼承bike,叫爸爸
		super(4);
	}
	
	
	public	boolean isLight() {return light;} //檢查有沒有開燈,一開始是亮的
	public	void switchLight() {light =!light;} //開關燈按鈕, 開燈不相等就是關燈
	
	
	public	void upSpeed() {
			speed = speed<1 ? 1:speed*2.4;  // 父親腳踏車有設定private,所以
		}
	
	public void downSpeed() {
		speed = speed<1 ? 0: speed*0.7; //速度<1時 速度0,其他情況*0.7
	}
	
	public double getSpeed() {  //回傳速度值,顯示速度
		return speed;     
	}
	}

