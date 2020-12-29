package com.household.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.household.service.HouseInfoMangerService;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class DelHouseInfoServlet
 */
@WebServlet("/delHouseInfoServlet")
public class DelHouseInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelHouseInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HouseInfoMangerService hims=new HouseInfoMangerServiceImp(); 
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		int homeId=Integer.parseInt(request.getParameter("id"));
		hims.delHouseInfoById(homeId);
		System.out.println(homeId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
