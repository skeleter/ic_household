package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.ParkingInfoDao;
import com.household.pojo.ParkingInfo;
import com.household.util.C3P0Utils;

public class ParkingInfoDaoImp implements ParkingInfoDao {

	/**
	 * 根据车位id获取车位信息
	 */
	@Override
	public List<ParkingInfo> getParkingInfoByParkingId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId,parking_location parkingLocation ,rent rent FROM parking_info WHERE parking_id=?";
		BeanListHandler<ParkingInfo> handler = new BeanListHandler<ParkingInfo>(ParkingInfo.class);
		try {		
			 return qr.query(sql,handler,id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加车位id车位信息
	 */
	@Override
	public int addParkingInfo(ParkingInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO parking_info VALUES(?,?,?)";
		try {
			return qr.update(sql, c.getParkingId(), c.getParkingLocation(),c.getRent());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 删除车位id车位信息
	 */
	@Override
	public int delParkingInfo(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM parking_info WHERE parking_id=?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 修改车位id车位信息
	 */
	@Override
	public int updateParkingInfo(ParkingInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE parking_info SET parking_id=?,parking_location=?,rent=? WHERE parking_id=?";
		try {
			return qr.update(sql, c.getParkingId(),c.getParkingLocation(),c.getRent(),c.getParkingId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 得到所有车位id车位信息
	 */
	@Override
	public List<ParkingInfo> getParkingInfoAll() {
		BeanListHandler<ParkingInfo> handler = new BeanListHandler<ParkingInfo>(
				ParkingInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId,parking_location parkingLocation ,rent rent FROM parking_info";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 得到一个租金区间的车位id车位信息
	 */
	@Override
	public List<ParkingInfo> getParkingInfoByRentSection(float min, float max) {
		BeanListHandler<ParkingInfo> handler = new BeanListHandler<ParkingInfo>(
				ParkingInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId,parking_location parkingLocation ,rent rent FROM parking_info WHERE rent BETWEEN ? AND ?";

		try {
			return qr.query(sql, handler,min,max);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *按照车牌查询车位信息（多表查询，ParkingInfo，ParkingRentInfo）（输入string，返回ParkingInfo）
	 */
	@Override
	public List<ParkingInfo> getParkingInfoByParkingLocation(String parkingLocation) {
		BeanListHandler<ParkingInfo> handler = new BeanListHandler<ParkingInfo>(
				ParkingInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId,parking_location parkingLocation ,rent rent FROM parking_info WHERE parking_id IN(SELECT parking_id FROM parking_rent_info WHERE plate_number=?)";

		try {
			return qr.query(sql, handler,parkingLocation);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *查询剩余10天以内的车位信息（多表查询，ParkingInfo，ParkingRentInfo）（无输入，返回ParkingInfo）
	 */
	@Override
	public List<ParkingInfo> getParkingInfoWithinTenDays() {
		BeanListHandler<ParkingInfo> handler = new BeanListHandler<ParkingInfo>(
				ParkingInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql ="SELECT parking_id parkingId,parking_location parkingLocation ,rent rent FROM parking_info WHERE parking_id IN("+

					"SELECT parking_id FROM parking_rent_info WHERE DATEDIFF(parking_time_end,NOW())<=10)";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
