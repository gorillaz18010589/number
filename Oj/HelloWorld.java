package tw.brad.myjava;
//doGet =>�@�몺URL
//doPost => ��دS�ʸ�T����,�ɮפW��
//�p�G���󭫨ӨS���Q�H�o�͹L,���A���|�N�����O���ͥX�Ӫ��������,��ӷ|�Q�ΥL�A�Ȥj��
//�u���@�Ӫ���b�A�ȥ��@��
//�bsever���غc�O����S�N�q
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld") //���w�b�~��user�ݬO�γo�Ӥ覡�Ӧs�����W��
public class HelloWorld extends HttpServlet { //������O�b�o��,�û��~�� HttpServlet
	private static final long serialVersionUID = 1L; //���q�ŧi�����n���n�Q�γo�ӷ��ڪ������Ǹ�
	private int a;
	private static int b;
    public HelloWorld() { //�غc��
        super();
        System.out.println("Helooworld();");
    }
    //���H�a���ШD���X�^��
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		a++; b++;
		System.out.println("doGet()");
		response.setContentType("text/html; charset=UTF-8"); //�]�wHTML�榡,����
		response.getWriter().append("Served at: ")
		.append(request.getContextPath())
		.append("<h1>Hello,World</h1>");  //�s�WHTML hi�r��
	}
	//�ɮפW��,���ø�T
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
