package com.household.dao;

import java.util.List;

import com.household.pojo.CarIoData;

public interface CarIoDataDao {
	List<CarIoData> getCarIoDataByCarId(int id);
	int addCarIoData(CarIoData c);
	int delCarIoData(CarIoData c);
	int updateCarIoData(CarIoData c);
	List<CarIoData> getCarIoDataAll();
}
