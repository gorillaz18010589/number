package c;

import java.io.File;

public class Brad23 {
	//ava.io=> File : 沒有無傳參數建構式
	//java有跨平台
	//路徑也是檔案的觀念,本身也占有空間
	//在C巢創bird資料夾 再進去創dir1 跟test1
	//物件是物件但東西有沒有是另外的觀念
	//寫程式最好寫相對目錄不要寫C:
	//file就是不含點兩下做的事,只要是檔案總管的事都在file api去處理
	
	public static void main(String[] args) {
	System.out.println(File.pathSeparator); //windows印出;   mac 印出: 路徑搜尋符號
	System.out.println(File.separator);		//window印出\    mac 印出/
	System.out.println("=================");
	
	//  \\brad\\dir1
	File file = new File("c:/brad/dir1"); //在java加\代表跳脫字元 \n這種東西,後面加\\或是用/也可以
	System.out.println(file.exists()); //印出檔案有沒有在

		File[] roots = file.listRoots(); //列出根目錄
		for(File root : roots) {
			System.out.println(root.getAbsolutePath()); 
		}
	}

}
