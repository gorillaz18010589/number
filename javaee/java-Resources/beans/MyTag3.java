package tw.brad.beans;
//玩屬性的方式
import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag3 extends SimpleTagSupport{
	//標籤屬性,一定要封裝
	private String name;
	private String price;
	
	public void setName(String name) {this.name = name;}
	public void setPrice(String price) {this.price = price;}
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		JspWriter out = getJspContext().getOut();
//		out.print(name +":" + price);
		
		//以下玩body
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		
		String stringBody = sw.toString();
		
		
		out.print(stringBody + ":" + name +"=>" +price);
	}

}
