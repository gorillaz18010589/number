package c;
//Thread=>interrupt():插入一個例外丟出來,再配合你的方法break出去
//Thread=>isDaemon():
//Thread=>join():讓別人可以先插隊我先旁邊等
//Thread=>setDaemon(boolean on):設定背景執行緒
//531-532都會同時執行,因為531可能會呼叫到532所以讓他認識
//Thread=>yield():讓出是讓別人有機會進來,但你可能也有被挑近來
public class Brad53 {

	public static void main(String[] args) {
		Brad531 obj1 = new Brad531();
		Brad532 obj2 = new Brad532();
		
//		obj1.setDaemon(true); //設定後0~10布跑了
		obj1.name = "A";
		obj1.b532 = obj2;
		obj2.name = "B";
		
		obj1.start();
		obj2.start();
		
		System.out.println("main ok");
		
		//一般寫法內部寫法obj1一下就認識了
		new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i);
					
					if(i==7) {
						obj1.interrupt();
					}
					
					try {
						Thread.sleep(500);
					}catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}.start();

	}

}
class Brad531 extends Thread{
	String name;
	Brad532 b532 = null;
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name + ":" +i);
			try {
			if(i==10) {
				b532.join(3*1000);//媽媽做到步驟10小明要叫進來買醬油,讓你差這動作近來排隊,但CPU不一定選你
			}else {
				Thread.sleep(500);
			}
			}catch (Exception e) {
				break;
			}
			
		}
	}
}

class Brad532 extends Thread{
	String name;
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name + ":" +i);
			try {
			Thread.sleep(500);
			}catch (Exception e) {
			
			}
		}
	}
}

