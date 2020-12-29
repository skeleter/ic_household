package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.HouseInfoDao;
import com.household.pojo.HouseInfo;
import com.household.util.C3P0Utils;


public class HouseInfoDaoImp implements HouseInfoDao{
	QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	/**
	 * 根据房屋id获取房屋信息，查不到返回null
	 */
	@Override
	public List<HouseInfo> getHouseInfoByHouseId(int id) {
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
		String sql = "INSERT INTO house_info VALUES(?,?,?,?,?,?)";
		if(c.getHouseId()==0){
			c.setHouseId(null);
		}
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
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(HouseInfo.class);
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
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(HouseInfo.class);
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
	@Override
	public List<HouseInfo> getHouseInfoAll() {
		// TODO Auto-generated method stub
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(HouseInfo.class);
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//查询出租的房子的信息，多表查询（PersonOwnerInfo，HouseInfo）（无输入，返回HouseInfo信息）
	public List<HouseInfo> getHouseInfoBychuzu() {
		String sql = "SELECT  house_id AS houseId,building,FLOOR,room,house_type_id AS houseTypeId,house_info.resident_id AS residentId "
				+ "FROM house_info INNER JOIN person_owner_info ON house_info.resident_id = person_owner_info.resident_id"
				+ " WHERE person_owner_info.owner_id IN (SELECT owner_id FROM person_renter_info)";
		try {
			return qr.query(sql, new BeanListHandler<HouseInfo>(HouseInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
