package c;


public	class  mot extends bike{  //public ���}��~��~ extends //�~��
	private boolean light; //�гy�@�ӵn
	//�Ĥ@��O��l�ܩp����,
	public mot() {
		// super(); �����O,�~��bike,�s����
		super(4);
	}
	
	
	public	boolean isLight() {return light;} //�ˬd���S���}�O,�@�}�l�O�G��
	public	void switchLight() {light =!light;} //�}���O���s, �}�O���۵��N�O���O
	
	
	public	void upSpeed() {
			speed = speed<1 ? 1:speed*2.4;  // ���˸}�񨮦��]�wprivate,�ҥH
		}
	
	public void downSpeed() {
		speed = speed<1 ? 0: speed*0.7; //�t��<1�� �t��0,��L���p*0.7
	}
	
	public double getSpeed() {  //�^�ǳt�׭�,��ܳt��
		return speed;     
	}
	}

