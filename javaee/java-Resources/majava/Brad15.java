package tw.brad.myjava;
//Model (�t��b�o��)
//�n��Controller,�����o��O�o��Model�h���t��
public class Brad15 {
	private int x, y;
	public Brad15(String x, String y) {//Brad14��J�r���]�즹�غc��
		this.x = Integer.parseInt(x); //���쪺�r��n�ର��Ʀs�J�~��private�� int x
		this.y = Integer.parseInt(y);
	}
	public int add() {
		return x + y;
	}
}
