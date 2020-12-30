package com.household.service.impl;
import java.util.List;

import org.junit.Test;

import com.household.dao.ParkingInfoDao;
import com.household.dao.ParkingRentInfoDao;
import com.household.dao.impl.ParkingInfoDaoImp;
import com.household.dao.impl.ParkingRentInfoDaoImp;
import com.household.pojo.ParkingInfo;
import com.household.pojo.ParkingRentInfo;
import com.household.service.ParkingMangerService;

public class ParkingMangerServiceImpl implements ParkingMangerService {
	
	ParkingRentInfoDao prid = new ParkingRentInfoDaoImp();
	ParkingInfoDao pid = new ParkingInfoDaoImp();
	/**
	 * 1.对车位信息的增加（输入ParkingInfo，返回布尔类型）
	 */
	@Override
	public boolean addParkingInfo(ParkingInfo pi) {
		int flag = pid.addParkingInfo(pi);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *2、 根据车位id对车位信息的删除（输入int，返回布尔类型）
	 */
	@Override
	public boolean delParkingInfoByParkingId(int id) {
		int flag = pid.delParkingInfo(id);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *3.对车位信息的修改（输入ParkingInfo，返回布尔类型）
	 */
	@Override
	public boolean updateParkingInfo(ParkingInfo pi) {
		int flag = pid.updateParkingInfo(pi);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *4.对车位租赁信息的增加（输入ParkingRentInfo，返回布尔类型）
	 */
	@Override
	public boolean addParkingRentInfo(ParkingRentInfo pri) {
		int flag = prid.addParkingRentInfo(pri);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}


	/**
	 *5.根据车位id对车位租赁的信息删除（输入parking_id（int）,返回布尔类型）
	 *未设置主键或唯一，有同id的可能，有可能会造成依次删除多条
	 */
	@Override
	public boolean delParkingRentInfoByParkingId(int id) {
		int flag = prid.delParkingRentInfo(id);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *6.对车位租赁信息的修改（输入ParkingRentInfo，返回布尔类型）
	 */
	@Override
	public boolean updateParkingRentInfo(ParkingRentInfo pri) {
		int flag = prid.updateParkingRentInfo(pri);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *7.查询所有车位信息（无输入，返回List<ParkingInfo>)
	 */
	@Override
	public List<ParkingInfo> getAllParkingInfo() {
		return pid.getParkingInfoAll();
	}

	/**
	 *8.查询所有车位租赁信息（无输入，返回List<ParkingRentInfo>)
	 */
	@Override
	public List<ParkingRentInfo> getAllParkingRentInfo() {
		return prid.getParkingRentInfoAll();
	}

	/**
	 *9.查询未租或已租出去的车位信息（输入布尔类型，已租为true，未租为false，返回List<ParkingInfo>)
	 */
	@Override
	public List<ParkingInfo> getParkingRentInfoIsRent(boolean flag) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 *10.查询租金在一定区间内的车位（输入float，float，返回List<ParkingInfo>)
	 */
	@Override
	public List<ParkingInfo> getParkingInfoByRentSection(float min, float max) {
		return pid.getParkingInfoByRentSection(min, max);
	}

	/**
	 *11.按照车牌查询车位信息（多表查询，ParkingInfo，ParkingRentInfo）（输入string，返回ParkingInfo）
	 */
	@Override
	public List<ParkingInfo> getParkingInfoByParkingLocation(String parkingLocation) {
		return pid.getParkingInfoByParkingLocation(parkingLocation);
	}

	/**
	 *12，查询剩余10天以内的车位信息（多表查询，ParkingInfo，ParkingRentInfo）（无输入，返回ParkingInfo）
	 */
	@Override
	public List<ParkingInfo> getParkingInfoWithinTenDays() {
		return pid.getParkingInfoWithinTenDays();
	}

	
}
