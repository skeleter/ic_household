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
import com.household.pojo.HouseInfo;
import com.household.pojo.HouseInfoAll;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class gethouseinfo
 */
@WebServlet("/gethouseinfo")
public class GetHouseInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHouseInfoServlet() {
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
		//List<HouseInfo> list= new HouseInfoMangerServiceImp().getAllHouseInfo();
		out.write(JSON.toJSONString(new HouseInfoMangerServiceImp().getAllHouseInfoAll()));
		out.flush();
		out.close();
	}
//	@Test
//	public void show(){
//		List<HouseInfoAll> list= new HouseInfoMangerServiceImp().getAllHouseInfoAll();
//	String	a="";
//		for (HouseInfoAll houseInfo : list) {
//			a+=houseInfo.toString()+"\n";
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
