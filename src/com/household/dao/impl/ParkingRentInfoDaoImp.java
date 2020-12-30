package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.ParkingRentInfoDao;
import com.household.pojo.ParkingRentInfo;
import com.household.util.C3P0Utils;

public class ParkingRentInfoDaoImp implements ParkingRentInfoDao {

	/**
	 * 根据车位id得到车位租赁信息
	 */
	@Override
	public List<ParkingRentInfo> getParkingRentInfoByParkingId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId, resident_id residentId,plate_number plateNumber,parking_time_start parkingTimeStart,parking_time_end parkingTimeEnd FROM parking_rent_info WHERE parking_id=?";
		BeanListHandler<ParkingRentInfo> handler = new BeanListHandler<ParkingRentInfo>(
				ParkingRentInfo.class);
		try {
			return qr.query(sql,handler,id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据住户id得到车位租赁信息
	 */
	@Override
	public List<ParkingRentInfo> getParkingRentInfoByResidentId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId, resident_id residentId,plate_number plateNumber,parking_time_start parkingTimeStart,parking_time_end parkingTimeEnd FROM parking_rent_info WHERE resident_id=?";
		BeanListHandler<ParkingRentInfo> handler = new BeanListHandler<ParkingRentInfo>(
				ParkingRentInfo.class);
		try {
			return qr.query(sql,handler,id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 添加车位租赁信息
	 */
	@Override
	public int addParkingRentInfo(ParkingRentInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO parking_rent_info VALUES(?,?,?,?,?)";
		try {
			return qr.update(sql, c.getParkingId(),c.getResidentId(),c.getPlateNumber(),c.getParkingTimeStart(),c.getParkingTimeEnd());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 根据车id删除车位租赁信息
	 */
	@Override
	public int delParkingRentInfo(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM parking_rent_info WHERE parking_id=?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 修改车位租赁信息
	 */
	@Override
	public int updateParkingRentInfo(ParkingRentInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE parking_rent_info SET parking_id=?,resident_id=? ,plate_number=?,parking_time_start=?,parking_time_end=? WHERE parking_id=?";
		try {
			return qr.update(sql, c.getParkingId(),c.getResidentId(),c.getPlateNumber(),c.getParkingTimeStart(),c.getParkingTimeEnd(),c.getParkingId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}


	/**
	 * 得到所有车位租赁信息
	 */
	@Override
	public List<ParkingRentInfo> getParkingRentInfoAll() {
		BeanListHandler<ParkingRentInfo> handler = new BeanListHandler<ParkingRentInfo>(
				ParkingRentInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT parking_id parkingId, resident_id residentId,plate_number plateNumber,parking_time_start parkingTimeStart,parking_time_end parkingTimeEnd FROM parking_rent_info";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
