package c;

public class T21_�}�C�D�� {

	public static void main(String[] args) {
		int a=0;
		String[] mesg= {"OK","XX"};
		System.out.println(mesg[a]); 
		a = a ^ 1;    //���ʬۧl 0 ^ 1 =>1
		System.out.println(mesg[a]);
		a = a ^ 1; 	//�P�ʬۥ�  1 ^ 1 => 0
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
		System.out.println(mesg[a]);
		a = a ^ 1; 
	}

}
