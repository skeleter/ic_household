package com.household.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.household.pojo.AccountInfo;
import com.household.service.RegisterAndLoginService;
import com.household.service.impl.RegisterAndLoginServiceImp;

/**
 * Servlet implementation class Text
 */
@WebServlet("/text")
public class Text extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Text() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name= request.getParameter("name");
		String pwd=request.getParameter("pwd");
		System.out.println("axios传递过来的：name--"+name+"---pwd---"+pwd);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out= response.getWriter();
		RegisterAndLoginService ral=new RegisterAndLoginServiceImp();
		if(ral.isUnameAndPassWordRight( new AccountInfo())){
			out.write("true");
		}else{
			out.write("false");
		}
			
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
