package servlet.http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		System.out.println("from 요청받음");
		String id = request.getParameter("userId");
		System.out.println(id);
		String pw = request.getParameter("userPwd");
		System.out.println(pw);
		String gender = request.getParameter("gender");
		System.out.println(gender);
		String[] menuList = request.getParameterValues("menu");
		System.out.println(menuList);
		
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("<h1>정보를 출력합니다</h1>");
		out.println("<p>당신의 아이디는 :" + id + "</p>");
		out.println("<p>당신의 비밀번호는 :" + pw + "</p>");
		String genderResult = gender.equals("M") ? "남자" : "여자";
		out.println("<p>당신의 성별은 : " + genderResult + "</p>");
		if(menuList != null) {
			out.println("<ul>");
		for(String menu : menuList) {
			out.println("<li>" +menu + "</li>");
			
		}	
		out.println("</ul>");
		out.println("</body></html>");
		}
		
		out.close();
}
}
