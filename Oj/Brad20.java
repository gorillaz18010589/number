package c;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad20 extends JFrame implements  ActionListener{ //JFrame implements  ActionListener 實做ActionListener
	private JButton b1,b2,b3;  //按鈕屬性配置3個
	private JTextArea textArea;
public Brad20() {//外觀在我初始話決定
		super ("window test"); //繼承老爸的建構式標題
//		FlowLayout layout = new FlowLayout();  //把有實作的類別叫過來,這方法是比較正式
		
//		setLayout(new FlowLayout()); //他需要這個介面,直接要的時候在把式內設計師叫出來
		setLayout(new BorderLayout()); //版面配置
		JPanel top = new JPanel(new FlowLayout());  //jpane容器放三個安紐
		b1 = new JButton("B1"); //你現在只是買了一個按鈕,但還沒說要布要放進來
		b2 = new JButton("B2"); //你只是擁有物件但還沒跟式窗介面合體
		b3 = new JButton("B3"); 
		top.add(b1); top.add(b2); top.add(b3); //容器裡面增加三個按鈕
		add (top,BorderLayout.NORTH); //容器放在最上面
		//加入介面
		//BorderLayout.NORTH 按鈕設置東南西北
//		add(b1,BorderLayout.NORTH);add(b2,BorderLayout.WEST);add(b3,BorderLayout.CENTER); //把按鈕加入到介面理 他有適度的RWD因為FlowLayout()
		
		//文字區產生
		textArea = new JTextArea(); //產生文字區域物件實體
		add(textArea,BorderLayout.CENTER); //產生文字物件實體,版面配置在,中間'
		
		//
		MyListener listener = new MyListener(b1, b2, b3);
		b1.addActionListener(this); b1.addActionListener(listener);
//		b1.addActionListener(listener); //3個按鈕都找同一個人按出OK
//		b2.addActionListener(listener);
//		b3.addActionListener(listener);
		
		//把Class implements  ActionListener
		b1.addActionListener(this); //add是增加, set是新增取代
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		b3.addActionListener(new ActionListener() { //直接在這物件實體new ActionListener(),不用寫類別
			//當場跟人講做的事情是什麼,不用再另外寫class
			//內部的匿名類別k
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B3");
				
			}
		});
		
		MyMouseListener mouseListener = new MyMouseListener();
		textArea.addMouseListener(mouseListener);  //新增一個滑鼠點擊事件
		textArea.addMouseMotionListener(mouseListener); //新增一個滑鼠移動的事件監聽
		
		//(1)設定視窗
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//想要再式窗裡面擺一些東西,彈性一點的
		//查Jfarme api看老爸哪個分支找api比較快
		//Container祖先有,進來找
		//Jfarme setLayout(LayoutManager manager)你要找室內設計師
		//Interface LayoutManager 規劃的設計師經理
		//Component =>add():
		//All Known Implementing Classes: 已經實作的方法
		//Class FlowLayout 可以做rwd彈性的
		//FlowLayout()
		//想要擺buuton物件實體,還要放哪裡
		// JButton 做出按鈕的api
		// BorderLayout =>版面配置
		//再來Jpanel 容器 =>JPanel(LayoutManager layout)
		//JTextArea 加入文字區域
		//JButton=>addActionListener :你去指定窗空,跟他要求,窗口要有人聽才可以
		//	actionPerformed(ActionEvent e)
		//textarea =>.Component => addMouseListener
		// MouseAdapter條電器 ,都是Mouse事件透過條電器調整
	}

public void  actionPerformed (ActionEvent e) {  //上面規劃這邊實做,這是寫在裡面輕鬆
	if(e.getSource() ==b1) {  //哪個物件發生事情,是不是b1
		System.out.println("我是B1");
	}else if(e.getSource() ==b2) {
		System.out.println("我是B2");
	}else if(e.getSource() ==b3) {
		System.out.println("我是B3");
	}
	System.out.println("OK2:" + e.getActionCommand()); 
}
	public static void main(String[] args) {
		//抽象實做
		new Brad20(); //單一視窗程式
	}

}

//在外面撰寫一個實做點擊事件


	class MyListener implements ActionListener { //從外部做事件點擊
		private JButton b1, b2, b3;
		public MyListener(JButton b1, JButton b2, JButton b3) {
			this.b1 = b1; this.b2 = b2; this.b3 = b3;
		}
	
	public void  actionPerformed (ActionEvent e) { //actionPerformed再聽,聽這個動作是因為委託他後產生的,不是我呼叫的,事件一發生就自動跑到這個物件(e)
		System.out.println("OK:" + e.getActionCommand()); //表現方法在這邊,getActionCommand()抓字串(B1)
	}
}
	 //用電壓器製造滑鼠方法
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) { //滑鼠壓下方法
			//super.mousePressed(e);
			System.out.println("mouse press");
		}
		
		@Override
		public void mouseDragged(MouseEvent e) { //滑鼠下拉方法
			//super.mouseDragged(e);
			System.out.println("mouse drag");
		}
	}