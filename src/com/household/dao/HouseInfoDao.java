package com.household.dao;

import java.util.List;

import com.household.pojo.HouseInfo;

public interface HouseInfoDao {
	List<HouseInfo> getHouseInfoByHouseId(int id);
	List<HouseInfo> getHouseInfoByHouseTypeId(int id);
	List<HouseInfo> getHouseInfoByResidentId(int id);
	int addHouseInfo(HouseInfo c);
	int delHouseInfo(HouseInfo c);
	int updateHouseInfo(HouseInfo c);
	List<HouseInfo> getHouseInfoAll();
}
