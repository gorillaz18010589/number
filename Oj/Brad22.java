package c;

import java.security.cert.CertificateException;
import java.util.TooManyListenersException;

import javax.management.RuntimeErrorException;
import javax.security.auth.login.CredentialExpiredException;

public class Brad22 {

	public static void main(String[] args) {
		//介紹例外Exception
		//例外是可以處理的,錯誤是不能的
		//地9行發生例外 
		//這些例外都是發生在執行上的例外,叫值型例外(RuntimeException)其餘的叫Checked Exception(叫做要是先檢查的例外)
		//RuntimeException不處理不罵你,後過自行負責
		int a = 10 , b=3; //b=3;
		int c;
		int[]d = {1,2,3,4};
		try { //你發生有可能的例外,拋出來
		c = a /b;
		System.out.println(c);
		System.out.println(d[4]); //改成4因為超過陣列出線ArrayIndexOutOfBoundsException:
		}catch(ArithmeticException ae) { //如果發生例外catch抓到,處理ART數學ae先做這件事,再繼續跑
			System.out.println("出現例外!!!,先catch這邊,在繼續往下走");
		}catch (ArrayIndexOutOfBoundsException ae) { //陣列超過範圍
			System.out.println("超過陣列範圍");
		}
		System.out.println("例外跑在這邊印出game over");
		
		//講設計觀念
		Bird b1 = new Bird();
		try {
			b1.setleg(10);  
			}// catch(Exception e) { //用這個大例外捕手來抓,全部都抓得到
				
			//}
			catch (CredentialExpiredException e) { //小的警察 兒子
				
			}catch (CertificateException e) { //中的警察 爸爸
				
			}catch (Exception e) { //警察局長 爺爺
			
			}
		
	}
 
}
	 //宣告一個方法可能拋出例外,你必須try事先準備
	 //例外不是壞事,他反而創造一個彈性,人家有講要你是先做處理

class Bird{  
	private  int leg;  //有幾隻腳
		//你下面講整個例外都可以拋出 可以嚴重的講,但不能少不能小,怕你拋得太大
	void setleg (int n) throws Exception{CertificateException,CredentialExpiredException//(抓這兩個的例外)
//	                 	throws Exception{ //(throws宣告意思) Exception 我真的有說這招要是先檢查,你一定要加try
		
		if(n>=0 && n<2) {
		leg = n;
		}else if (n<0) { //小於2的例外
			throw new CertificateException(); //其他的拋出例外你自己去處理我不想寫死
		}else if (n>2) {
			throw new CredentialExpiredException();
		}
	}
}