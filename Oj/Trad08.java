package tw.hank;

public class Trad08 {

	public static void main(String[] args) {
		String line ="1,Brad Chao,18,台中市,1999-01-02"; //切割字串
		String [] felids = line.split(","); //有,就切割掉
		for(String field: felids) {
			System.out.println(field);
		}
		//1.要網址抽出來
		//2.哪些參數其值
		System.out.println("----");
		String url =
				"http://www.goggle.com/index.php?name=brad&gender=male";
		String[] myurl =url.split("\\?"); //如何切割問號,因正規表示法,\=>不是正規表示法,\在保持他的元素所以要\\
		String uu =myurl[0];
		System.out.println(uu);
		
		String [] params =myurl[1].split("&");
		for(String param :params) {
			System.out.println(param);
		}
		
	}

}
