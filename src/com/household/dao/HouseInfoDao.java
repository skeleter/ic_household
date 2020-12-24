package com.household.dao;

import java.util.List;

import com.household.pojo.HouseInfo;

public interface HouseInfoDao {
	List<HouseInfo> getHouseInfoByHouseId(int id);
	List<HouseInfo> getHouseInfoByHouseTypeId(int id);
	List<HouseInfo> getHouseInfoByResidentId(int id);
	int addHouseInfo(HouseInfo c);
	int delHouseInfoById(int id);
	int updateHouseInfo(HouseInfo c);
	List<HouseInfo> getAllHouseInfo();
	List<HouseInfo> getHouseInfoLikeHouseType(String type);
	List<HouseInfo> getHouseInfoByResident(boolean flag);
	List<HouseInfo> getHouseInfoByFloor(int floor);
	List<HouseInfo> getHouseInfoAll();
	List<HouseInfo> getHouseInfoBychuzu();	
}
