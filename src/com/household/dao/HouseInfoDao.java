package com.household.dao;

import java.util.List;

import com.household.pojo.HouseInfo;

public interface HouseInfoDao {
	List<HouseInfo> getHouseInfoByHouseId(int id);
	List<HouseInfo> getHouseInfoByHouseTypeId(int id);
	List<HouseInfo> getHouseInfoByResidentId(int id);
	int addHouseInfo(HouseInfo c);
	int updateHouseInfo(HouseInfo c);
	int delHouseInfoById(int id);
	List<HouseInfo> getAllHouseInfo();
	List<HouseInfo> getHouseInfoLikeHouseType(String type);
	List<HouseInfo> getHouseInfoByResident(boolean flag);
	List<HouseInfo> getHouseInfoByFloor(int floor);
	List<HouseInfo> getHouseInfoAll();
	//查询出租的房子的信息，多表查询（PersonOwnerInfo，HouseInfo）（无输入，返回HouseInfo信息）
	List<HouseInfo> getHouseInfoBychuzu();
}
