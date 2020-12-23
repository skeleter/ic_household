package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.HouseInfoDao;
import com.household.pojo.HouseInfo;
import com.household.pojo.PropertyEmplayeesInfo;
import com.household.util.C3P0Utils;


public class HouseInfoDaoImp implements HouseInfoDao{
	/**
	 * 根据房屋id获取房屋信息，查不到返回null
	 */
	@Override
	public List<HouseInfo> getHouseInfoByHouseId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE house_id=? ";
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据房屋类型id获取房屋信息，查不到返回null
	 */
	@Override
	public List<HouseInfo> getHouseInfoByHouseTypeId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE house_type_id=? ";
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据住户id获取房屋信息，查不到返回null
	 */
	@Override
	public List<HouseInfo> getHouseInfoByResidentId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE resident_id=? ";
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加房屋信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int addHouseInfo(HouseInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO house_info VALUES(?,?,?,?,?,?)";
		try {
			return qr.update(sql,c.getHouseId(),c.getBuilding(),c.getFloor(),c.getRoom(),c.getHouseTypeId(),c.getResidentId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 删除房屋信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int delHouseInfoById(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM house_info WHERE house_id=?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 修改房屋信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int updateHouseInfo(HouseInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE house_info SET house_id=?,building=?,FLOOR=?,room=?,house_type_id=?,resident_id=? WHERE house_id=?";
		try {
			return qr.update(sql,c.getHouseId(),c.getBuilding(),c.getFloor(),c.getRoom(),c.getHouseTypeId(),c.getResidentId(),c.getHouseId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 得到所有房屋信息列表，查询失败返回0
	 */
	@Override
	public List<HouseInfo> getAllHouseInfo() {
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 对房屋类型进行模糊查询房屋信息
	 */
	@Override
	public List<HouseInfo> getHouseInfoLikeHouseType(String type) {
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE house_type_id IN( SELECT house_type_id houseTypeId FROM house_type WHERE house_type_name like concat('%',?,'%'))";

		try {
			return qr.query(sql, handler,type);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 对有无房主进行查询,true代表有房主，false代表没房主
	 */
	@Override
	public List<HouseInfo> getHouseInfoByResident(boolean flag) {
		String sql;
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(HouseInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql1 = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE resident_id IS NULL";
		String sql2 = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE resident_id IS NOT NULL";
		if (flag) {
			 sql = sql2;
		} else {
			 sql = sql1;
		}
		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 通过对楼号层高的查询（输入int，返回List<HouseInfo>)
	 */
	@Override
	public List<HouseInfo> getHouseInfoByFloor(int floor) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info WHERE FLOOR=? ";
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(
				HouseInfo.class);
		try {
			return qr.query(sql,handler,floor);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
