package tw.brad.myjava;

import com.berry.BCrypt;

//網站需要的工具,不需要物件實體
public class BradAPIs {
	public static boolean ckPasswd(String src, String cpasswd) {
		boolean isRight = false;
		if (cpasswd.startsWith("$2a$10$")) {  //如果加密帳密開頭是
			isRight = BCrypt.checkpw(src, cpasswd); //檢查帳密
		}
		return isRight;
	}
}