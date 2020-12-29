package com.household.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.household.pojo.HouseInfo;
import com.household.service.HouseInfoMangerService;
import com.household.service.impl.HouseInfoMangerServiceImp;

/**
 * Servlet implementation class SaveHouseInfoServlet
 */
@WebServlet("/saveHouseInfoServlet")
public class SaveHouseInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveHouseInfoServlet() {
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
		int homeNumber=Integer.parseInt(request.getParameter("home_number"));
		int homeFloor=Integer.parseInt(request.getParameter("home_floor"));
		int homeRoom=Integer.parseInt(request.getParameter("home_room"));
		int houseTypeId=Integer.parseInt(request.getParameter("building_id"));
		int residentId=Integer.parseInt(request.getParameter("resident_id"));
		System.out.println(homeNumber+"-"+homeFloor+"-"+homeRoom+"-"+houseTypeId+"-"+residentId);
		PrintWriter out= response.getWriter();
		//List<HouseInfo> list= new HouseInfoMangerServiceImp().getAllHouseInfo();
		HouseInfo houseInfo=new HouseInfo(homeId,homeNumber,homeFloor,homeRoom,houseTypeId,residentId);
		String info="0+操作失败，数据库未连接";
		if(hims.getHouseInfoIs(houseInfo.getHouseId())){
			if(hims.updateHouseInfo(houseInfo)){
				info="1+修改成功";
			}else{
				info="0+修改失败，需要检查数据";
			}
		}else{
			if(hims.addHouseInfo(houseInfo)){
				info="1+添加成功";
			}else{
				info="0+添加失败，需要检查数据";
			}
		}
		//out.write(JSON.toJSONString(new HouseInfoMangerServiceImp().getAllHouseInfoAll()));
		out.write(info);
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
