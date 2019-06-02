package tw.hank;

public class text07 {

	public static void main(String[] args) {
//		字串+=是很糟糕的寫法,會一值產生新的物件
//		String s1; 沒有初始值,sysout會失敗
//		String s2 =null; //字串先給空值
//		System.out.println(s2.charAt(0)); = 因為空字串所以裡面沒值,跑出來是NullPointerException
		
		String str1 ="A";
		String str2 =str1.concat("B");
		System.out.println(str1);
		System.out.println(str2);
		
		
		}
	}


