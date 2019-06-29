package c;
import java.text.SimpleDateFormat;
import java.util.Date;
//java.text.SimpleDateFormat :時間表格式
//java.util.Calendar
//java.util.TimerTask:抽象類別
//java.util.Calendar =>get(int field) :(回傳值int)
//java.util.Calendar =>getInstance():(回傳static Calendar)
//java.util.Timer=>schedule(TimerTask task, Date firstTime, long period) :設定時間的行程(方法,第一次執行時間,重新執行時間)
//java.util.Timer=>Timer()建構式:創造時間物件實體
//java.text.DateFormat=>format(Date date) : (回傳值String)
import java.util.Timer;

import javax.swing.JLabel;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;
	private int i;
	
	public MyClock() {
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 1*1000); //時間設定行程(型成方法,0,每秒都呼叫)
	}
	
	private class MyTask extends TimerTask {
		@Override
		public void run() {
			//設置右上角跑出時間
			SimpleDateFormat sdf =   new SimpleDateFormat("HH:mm:ss"); //時,分,秒
			String nowString  =	sdf.format(new Date()); 
			setText(nowString);
//			setText("Brad " + i++);
		}
	}
	
}