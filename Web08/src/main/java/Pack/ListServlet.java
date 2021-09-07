package Pack;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ListServlet() {
        super();
        System.out.println("������ ��");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list doGet");
		//DB���� �����͸� ����.
		String[] id = {"ȣ����", "�ڳ���", "������"};
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1' width='300'>");
		out.println("<tr rgbcolor='#ffff00'>");
		out.println("<td>���̵�</td>");
		out.println("<td>����</td>");
		out.println("<td>����</td>");
		out.println("</tr>");

		for (int i = 0; i < id.length; i++) {
			out.println("<tr>");
			out.println("<td>" + id[i] + "</td><br/>");
			//<td><a href = 'delete?id=ȣ����'>����</a></td>
			//"<td><a href='delete?id=" + id[] + "'>����</a></td>"
			out.println("<td><a href='delete?id=" + id[i] + "'>����</a></td>");
			out.println("<td><a href='update?id=" + id[i] + "'>����</a></td>");
			out.println("</tr>");
		}
		
		out.println("</table>");			
		out.println("</body>");			
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}