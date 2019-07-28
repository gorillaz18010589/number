package tw.brad.myjava;
//Model (演算在這邊)
//要讓Controller,不做這件是這邊Model去做演算
public class Brad15 {
	private int x, y;
	public Brad15(String x, String y) {//Brad14輸入字串後跑到此建構式
		this.x = Integer.parseInt(x); //拿到的字串要轉為整數存入外部private的 int x
		this.y = Integer.parseInt(y);
	}
	public int add() {
		return x + y;
	}
}
