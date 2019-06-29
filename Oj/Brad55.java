package c;

import java.awt.BorderLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//準備要寫打磚塊遊戲
//實現開頭的狀況,與時間週期有強烈關西
//要撰寫的東西足夠讓你開發2d遊戲
//java.awt.Graphics :畫圖
//javax.imageio :存讀圖片
//fps =>:遊戲每秒60針比較好看
public class Brad55 extends JFrame{
	private MyPanel myPanel;
	//設定視窗
	public Brad55() { 
		setLayout(new BorderLayout());
		
		myPanel =  new MyPanel(); //創造一個面板
		add(myPanel,BorderLayout.CENTER); //把面板放在中間
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	 //設定外觀,遊戲場景都在這
	private class MyPanel extends JPanel{
		private Timer timer;
		private int ballX,ballY,dx,dy; //(dx,dy位移)
		private int viewW, viewH,ballW,ballH;
		
		//設定時間
		MyPanel(){
			timer = new Timer();
			timer.schedule(new MyTask(),1*1000,100); //設定球的移動方法
			dx = dy =4; //球的移動速度
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			
			//抓視窗的寬高
			int w = getWidth(), h = getHeight(); //624:442
			System.out.println(w+ ":" +h);
			
			//設定球的圖片
			Graphics2D g2d =(Graphics2D)g; //轉型回來
			
			BufferedImage bimg;
			try {
				bimg = ImageIO.read(new File("imgs/ball.png")); //讀取球的檔案
				ballW = bimg.getWidth(); ballH = bimg.getHeight(); //球的寬等於螢幕寬,球的高等於螢幕高
				g2d.drawImage(bimg, ballX,ballY, null); //球的圖片在做標100,100的位置,球的X,y軸
			} catch (IOException e) {
			}
		
		}
		
		//內部類別中的內部類別,設定球跑的位置
		private class MyTask extends TimerTask{
			@Override
			public void run() {
				if(ballX <0 ||ballX + ballW >viewW) { //如果球的X<0碰到左邊的框, 或者是球加上寬有沒有超過螢幕寬度就是碰螢幕右邊
					dx*= -1; //位移轉向,球碰到寬座標變負的反方向彈
				}
				if(ballY <0 ||ballY +ballH >viewH) {
					dy*= -1;
				}
				ballX += dx;
				ballY += dy;
				repaint();
			}
		}
	}
	
	public static void main(String[] args) {
		new Brad55();
	}

	
	
}
