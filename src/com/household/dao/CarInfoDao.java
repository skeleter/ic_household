package com.household.dao;

import java.util.List;

import com.household.pojo.CarInfo;

public interface CarInfoDao {
	List<CarInfo> getCarInfoByCarId(int id);
	List<CarInfo> getCarInfoByParkingId(int id);
	List<CarInfo> getCarInfoByResidentId(int id);
	int addCarInfo(CarInfo c);
	int delCarInfo(CarInfo c);
	int updateCarInfo(CarInfo c);
	List<CarInfo> getCarInfoAll();
}
