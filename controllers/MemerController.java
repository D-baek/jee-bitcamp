package com.bank.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.domains.CustomerBean;

@WebServlet("/member.do")
public class MemerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("맥락이 맞아서 여기에 도착함 5 ㅎ");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String credit = request.getParameter("credit");
		CustomerBean m = new CustomerBean();
		m.setCredit(credit);
		m.setId(id);
		m.setPw(pwd);
		m.setSsn(ssn);
		m.setName(name);
		System.out.println("회원정보" + m.toString());
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
