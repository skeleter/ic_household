package com.household.dao;

import java.util.List;

import com.household.pojo.StareRentInfo;

public interface StareRentInfoDao {
	List<StareRentInfo> getStareRentInfoByStareId(int id);
	int addStareRentInfo(StareRentInfo c);
	int delStareRentInfo(StareRentInfo c);
	int updateStareRentInfo(StareRentInfo c);
	List<StareRentInfo> getStareRentInfoAll();
}
