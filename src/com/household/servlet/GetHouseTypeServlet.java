package com.household.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.household.pojo.HouseType;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class GetHouseTypeServlet
 */
@WebServlet("/getHouseTypeServlet")
public class GetHouseTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHouseTypeServlet() {
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
		PrintWriter out= response.getWriter();
		List<HouseType> list= new HouseInfoMangerServiceImp().getAllHouseType();
		
		out.write(JSON.toJSONString( new HouseInfoMangerServiceImp().getAllHouseType()));
		out.flush();
		out.close();
	}
//	@Test
//	public void show(){
//		List<HouseType> list= new HouseInfoMangerServiceImp().getAllHouseType();
//	String	a="";
//		for (HouseType houseType : list) {
//			a+=houseType.toString()+"\n";
//		}
//		System.out.println(a);
//	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
