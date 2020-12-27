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
import com.household.service.HouseInfoMangerService;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class gethouseinfo
 */
@WebServlet("/gethouseinfo")
public class gethouseinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gethouseinfoServlet() {
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
		out.write(JSON.toJSONString(new HouseInfoMangerServiceImp().getAllHouseInfo()));
		out.flush();
		out.close();
	}
	@Test
	public void show(){
		List<HouseInfo> list= new HouseInfoMangerServiceImp().getAllHouseInfo();
	String	a="";
		for (HouseInfo houseInfo : list) {
			a+=houseInfo.toString()+"\n";
		}
		System.out.println(a);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
