package c;
//awt.GridBagLayout:橫向
//swing.JLabel:
//java.lang.Thread=>activeCount():告訴
//isAlive():
//java.util.Timer :計時器for執行緒,去安排任務在往後時間要執行背景的行為
//java.util.Timer=>cancel():
//java.util.Timer=>cancel():
//java.util.Timer=>cancel():
//java.util.TimerTask:抽象類別
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//八個跑道橫向
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8]; //8個跑道用陣列
	private Car[] cars = new Car[8]; //汽車陣列
	private int rank;
	
	public Racing() {
		super("賽馬程式");
		
		setLayout(new GridLayout(9,1));
		
		go = new JButton("GO"); add(go);  //設置按鈕
		for(int i=0; i<lanes.length; i++) { //設置跑道
			lanes[i] = new JLabel((i+1 + "."));
			add(lanes[i]);
		}
		
		//寫按鈕方法新增一個按鈕方法
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		
		setSize(800,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	//另外拉出來寫安鈕方法比較乾淨
	private void go() {
//		System.out.println(Thread.activeCount()); 顯示執行緒
		
		//設定要全部跑完才能在run
		boolean isAllDead = true;
		for (int i=0; i<cars.length; i++) {
			if (cars[i]!= null && cars[i].isAlive()) {
				isAllDead = false;
				break;
			}
		}
		if (!isAllDead) return;

		rank=0;//重新時把名次歸0
		for (int i=0; i<cars.length; i++) {
			lanes[i].setText((i+1 + ". ")); //清跑道不是再新增一個物件是直接改內容
			cars[i] = new Car(i);
			cars[i].start(); //車子開始跑
		}
//		System.out.println(Thread.activeCount());   顯示執行緒
	}
	
	//跑道第一名時就跳出停止
//	private void stopRund() {
//		for(int i=0; i<cars.length; i++) {
//			cars[i].interrupt();
//		}
//	}
	
	//內部類別
	private class Car extends Thread{ //執行緒
		private int lane; //知道哪一個跑道就會去跑哪個跑道
		
		//建構式
		Car(int lane){this.lane=lane;} //哪個跑掉就跑哪個
		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				lanes[lane].setText(lanes[lane].getText() + ">"); //在文字行加入>
				
				//最後加入名次 
				if(i ==99) {
					lanes[lane].setText(lanes[lane].getText() + "第" + ++rank +"名"); //99跑完加上自己陣列的rank第幾名
				}
				//創造頻率
				try {
				Thread.sleep(50 +(int)(Math.random()*200)); //每個人都跑最少50最多250,用亂數設定8個車子不同頻率
				}catch (Exception e) {
				
				}
			}

		}
		
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
