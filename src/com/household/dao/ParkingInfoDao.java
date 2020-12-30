package com.household.dao;

import java.util.List;

import com.household.pojo.ParkingInfo;

public interface ParkingInfoDao {
	List<ParkingInfo> getParkingInfoByParkingId(int id);
	int addParkingInfo(ParkingInfo c);
	int delParkingInfo(int id);
	int updateParkingInfo(ParkingInfo c);
	List<ParkingInfo> getParkingInfoAll();
	List<ParkingInfo> getParkingInfoByRentSection(float min,float max);
	List<ParkingInfo> getParkingInfoByParkingLocation(String parkingLocation);
	List<ParkingInfo> getParkingInfoWithinTenDays();
}
