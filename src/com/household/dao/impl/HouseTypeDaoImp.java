package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.HouseTypeDao;
import com.household.pojo.HouseInfo;
import com.household.pojo.HouseType;
import com.household.util.C3P0Utils;

public class HouseTypeDaoImp implements HouseTypeDao {

	/**
	 * 根据房屋id获取房屋信息，查不到返回null
	 */
	@Override
	public List<HouseType> getHouseTypeByHouseTypeId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT house_type_id houseTypeId, house_type_name houseTypeName FROM house_type WHERE house_type_id=?";
		BeanListHandler<HouseType> handler = new BeanListHandler<HouseType>(
				HouseType.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加房屋类型信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int addHouseType(HouseType c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO house_type VALUES(?,?)";
		try {
			return qr.update(sql,c.getHouseTypeId(),c.getHouseTypeName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 删除房屋类型信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int delHouseTypeById(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM house_type WHERE house_type_id=?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 修改房屋类型信息，成功返回影响条数，失败返回0
	 */
	@Override
	public int updateHouseType(HouseType c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE house_type SET house_type_id=?, house_type_name=? WHERE house_type_id=?";
		try {
			return qr.update(sql,c.getHouseTypeId(),c.getHouseTypeName(),c.getHouseTypeId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 得到所有房屋类型信息列表，查询失败返回0
	 */
	@Override
	public List<HouseType> getHouseTypeAll() {
		BeanListHandler<HouseType> handler = new BeanListHandler<HouseType>(
				HouseType.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT house_type_id houseTypeId, house_type_name houseTypeName FROM house_type";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
