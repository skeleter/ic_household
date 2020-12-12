package com.household.dao;

import java.util.List;

import com.household.pojo.ParkingRentInfo;

public interface ParkingRentInfoDao {
	List<ParkingRentInfo> getParkingRentInfoByParkingId(int id);
	List<ParkingRentInfo> getParkingRentInfoByResidentId(int id);
	int addParkingRentInfo(ParkingRentInfo c);
	int delParkingRentInfo(ParkingRentInfo c);
	int updateParkingRentInfo(ParkingRentInfo c);
	List<ParkingRentInfo> getParkingRentInfoAll();
}
