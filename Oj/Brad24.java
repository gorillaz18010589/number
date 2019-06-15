package c;

import java.io.File;
import java.io.IOException;

public class Brad24 {

	public static void main(String[] args) {
		File dir11 = new File("./dir1/dir11"); //.代表這個目錄 ..代表上一層
		System.out.println(dir11.getAbsolutePath()); //要先知道你人在哪裡,人在這裡就是.  (C:\Users\admin\eclipse-workspace\tw.org.iii\.)
		
		//如果資料布在那就再11裡面建一個資料夾
		if (!dir11.exists()) { //如果dir11  不再
			dir11.mkdir(); //創一個資料夾
		}else {
			System.out.println("資料已建立");
		}
		
		//建立後代的資料夾
		File dir25 = new File("./dir2/dir3/dir4/dir5"); //一次把祖先資料夾都建立起來
		if(dir25.mkdirs()) {
			System.out.println("OK");
		}else {
			System.out.println("建立失敗");
		}
		
		//建立文件檔
		File file1 = new File("dir1/file1");
		try {
			file1.createNewFile();
			System.out.println("建立了文件檔");
		} catch (IOException e) {
		}
		
		//把咖啡照片從dir1改道dir2
		File source =new File("dir1/coffe.jpg"); //本來咖啡照片爸爸目錄在dir1
		File d =new File("dir2/coffe.jpg");  //創一個咖啡照片爸爸目錄在dir2
		source.renameTo(d); //改名子後就可以改目錄
	}

}
