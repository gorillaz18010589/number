package tw.hank;

import javax.swing.JFrame; //從老爸那繼承的位置

public class Trad15 extends JFrame { //jframe是老爸繼承上去
	public Trad15() {
	super("偶的視窗"); //把爸爸的方式拿來用
		
	setSize(640,480); //設定視窗尺寸但看不到
	setVisible(true); //顯示視窗(true)才看的到
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Trad15();
	}
}
