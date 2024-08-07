package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@WebServlet("/search")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 검색
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 1. 폼 값 받는다 
		String id = request.getParameter("id");
		
	// 2. DAO
		MemberDAO dao = new MemberDAO();
		Member member =null;
		
			try {
				dao.searchMember(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	// 3. 바인딩
			request.setAttribute("info", member);
	// 4.네비게이션		
			request.getRequestDispatcher("search.jsp").forward(request, response);
	}
}