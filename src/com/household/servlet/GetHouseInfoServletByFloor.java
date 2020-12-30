package com.household.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class GetHouseInfoServletByFloor
 */
@WebServlet("/getHouseInfoServletByFloor")
public class GetHouseInfoServletByFloor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHouseInfoServletByFloor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		int floor=Integer.parseInt(request.getParameter("floor"));
		System.out.println(floor);
		PrintWriter out= response.getWriter();
		//List<HouseInfo> list= new HouseInfoMangerServiceImp().getAllHouseInfo();
		out.write(JSON.toJSONString(new HouseInfoMangerServiceImp().getAllHouseInfoAllByFloor(floor)));
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
