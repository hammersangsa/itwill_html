package com.svt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");//post encoding
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		String str = name + "�� ���̴� " + age + "�� �Դϴ�";
		
		req.setAttribute("result", str);
		
		//������
		RequestDispatcher rd =
				req.getRequestDispatcher("/servlet/result.jsp");
		
		rd.forward(req, resp);
	}
}
