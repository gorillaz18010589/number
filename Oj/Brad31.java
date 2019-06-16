package c;
import java.io.FileReader;

public class Brad31 {

	public static void main(String[] args) {
		//讀文件夾資料,用chae讀出來
	try{
		FileReader reader = new FileReader("dir1/brad.txt"); //讀取資料夾
		int ret;
		while((ret = reader.read())!=-1) {
			System.out.println((char)ret);
		}	
			reader.close();		
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
