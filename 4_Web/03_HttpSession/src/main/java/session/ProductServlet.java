package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.vo.Member;

import java.io.IOException;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 세션 받아온다.
		HttpSession session = request.getSession();
		
		// 2. 세션에 바인딩된 값이 있다면 그 값을 찾아온다.(세션값을 멤버에 넣음)
		Member member = (Member) session.getAttribute("info");
		
		request.setAttribute("product", "notebook");
		
//		System.out.println(member);
		// 카트로 보낸다
//		response.sendRedirect("cart");
		request.getRequestDispatcher("cart").forward(request, response);
		
		
	}

}
