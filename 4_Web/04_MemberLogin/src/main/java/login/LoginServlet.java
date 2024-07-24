package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dao.MemberDAO;
import model.vo.Member;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDAO dao  = new MemberDAO();
		
		Member member = new Member(id, password,"테스트");
		
		HttpSession session = request.getSession();
		//
		session.setAttribute("info", member);
		//
		response.sendRedirect("index.jsp");
	}

}
