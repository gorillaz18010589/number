package tw.brad.beans;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag2 extends SimpleTagSupport{

		@Override
		public void doTag() throws JspException, IOException {
			// TODO Auto-generated method stub
			super.doTag();
			
		JspContext context =getJspContext();
		JspWriter out = context.getOut();
		JspFragment body =	getJspBody(); //取得身體
		
		StringWriter sw = new StringWriter();//在body內去做輸出
		body.invoke(sw);//在你寫的html body +加了sw的物件方法
		
		out.print("hello," +sw.toString().toUpperCase()); //轉成大寫
		}
		

}
