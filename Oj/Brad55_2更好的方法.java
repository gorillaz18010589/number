package c;

//準備要寫打磚塊遊戲
//實現開頭的狀況,與時間週期有強烈關西
//要撰寫的東西足夠讓你開發2d遊戲
//java.awt.Graphics :畫圖
//javax.imageio :存讀圖片
//fps =>:遊戲每秒60針比較好看
//java.time.LocalDate :本地時間
//java.time.LocalDate=> now():取得本地德系統時間
//java.time.LocalDateTime => 

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad55_2更好的方法 extends JFrame {
	private MyPanel myPanel;
	
	public Brad55_2更好的方法 () {
		setLayout(new BorderLayout());
	
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel{
		private Timer timer;
		private int viewW, viewH, ballW, ballH, stickX, stickY;
		private BufferedImage bgImg, stickImg;
		private BufferedImage[] ballImgs;
		private LinkedList<BallTask> balls;
		
		MyPanel(){
			ballImgs = new BufferedImage[4];
			try {
				bgImg = ImageIO.read(new File("imgs/bg1.jpg"));
				stickImg = ImageIO.read(new File("imgs/stick.jpg"));
				stickX = (640 - 96)/2; stickY = 400;
				
				for (int i=0; i<ballImgs.length; i++) {
					ballImgs[i] = ImageIO.read(new File("imgs/ball" + i + ".png"));
				}
				ballW = ballImgs[0].getWidth(); ballH = ballImgs[0].getHeight();
			} catch (IOException e) {
//				System.exit(0;　
				System.out.println(e.toString());
			}

			balls = new LinkedList<>();
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					createBall(e.getX(), e.getY());
				}
			});
			
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					moveStick(e.getX() - 48);
				}
			});
			
			timer = new Timer();
			timer.schedule(new RefreshView(), 0, 17);
			
		}
		
		private void moveStick(int x) {
			stickX = x;
		}
		
		private void createBall(int ex, int ey) {
			BallTask ball = new BallTask(
					ex - (int)(ballW/2.0), 
					ey - (int)(ballH/2.0),
					(int)(Math.random()*4));
			timer.schedule(ball, 0, 60);
			balls.add(ball);
		}
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.drawImage(bgImg, 0, 0, null); //背景圖設置在0.0做標
			for(BallTask ball : balls) {
				g2d.drawImage(ballImgs[ball.getImg()], ball.getX(), ball.getY(), null);
			}
			
			g2d.drawImage(stickImg, stickX, stickY, null);
			
		}
			//每顆球自己去展寫60針
		private class RefreshView extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class BallTask extends TimerTask {
			private int x, y, dx, dy, img;
			BallTask(int x, int y, int img){
				this.x = x; this.y = y; this.img = img;
				dx = dy = 8;
			}
			int getX() {return x;}
			int getY() {return y;}
			int getImg() {return img;}
			@Override
			public void run() {
				if (x < 0 || x + ballW > viewW) {
					dx *= -1;
				}
				if (y < 0 || y + ballH > viewH) {
					dy *= -1;
				}
				x += dx;
				y += dy;
			}
		}

		
	}
	

	public static void main(String[] args) {
		new Brad55_2更好的方法 ();
	}

}