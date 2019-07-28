package tw.brad.beans;
//寫這個類別就是一組標籤
//標籤最後的結果就是要輸出
import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class MyTag extends SimpleTagSupport{ //要繼承這個方法才能物件變成標籤
	
	@Override  //實做是在dotag上面
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		//進行輸出的動作
		JspContext context = getJspContext(); //拿到一個jsp全文物件,當時叫你的人
		JspWriter out = context.getOut();
		out.println("Hello,Brad");
	}

}
