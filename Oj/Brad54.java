package c;

import java.util.Calendar;
//java.util.Calendar
//java.util.TimerTask:抽象類別
//java.util.Calendar =>get(int field) :(回傳值int)
//java.util.Calendar =>getInstance():(回傳static Calendar)
//java.util.Timer=>schedule(TimerTask task, Date firstTime, long period) :設定時間的行程(方法,第一次執行時間,重新執行時間)
//java.util.Timer=>Timer()建構式:創造時間物件實體
import java.util.Timer;
import java.util.TimerTask;

public class Brad54 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task1 t1 = new Task1();
		Task2 t2 = new Task2(timer);
//		timer.schedule(t1, 3*1000); //3秒後印執行t1方案
		timer.schedule(t1, 1*1000 ,1*1000); //每一秒執行一次,每秒都執行
		timer.schedule(t2, 7*1000); //7秒時執行方案2
		System.out.println("Main");
	}
	
	static class Task1 extends TimerTask{
		@Override
		public void run() {
		//每秒都顯示時間
		Calendar now = Calendar.getInstance();
		int hh = now.get(Calendar.HOUR_OF_DAY);//得到時間
		int mm = now.get(Calendar.MINUTE);//得到分
		int ss = now.get(Calendar.SECOND); //得到秒
		
		System.out.println("do something:" + hh + ":" + mm + ":" + ss);
//		System.out.println("time out");
//		System.out.println("每秒都做");
		}
	}
}

//任務二讓他死
class Task2 extends TimerTask{
	private Timer timer;
	Task2(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel(); //清除
		timer.purge(); //清乾淨一點
	}
}
	






