package com.household.dao;

import java.util.List;

import com.household.pojo.HouseType;

public interface HouseTypeDao {
	List<HouseType> getHouseTypeByHouseTypeId(int id);
	int addHouseType(HouseType c);
	int delHouseTypeById(int id);
	int updateHouseType(HouseType c);
	List<HouseType> getHouseTypeAll();
}
