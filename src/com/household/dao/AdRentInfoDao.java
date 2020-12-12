package com.household.dao;

import java.util.List;

import com.household.pojo.AdRentInfo;


public interface AdRentInfoDao {
	List<AdRentInfo> getAdRentInfoByAdId(int id);
	int addAdRentInfo(AdRentInfo c);
	int delAdRentInfo(AdRentInfo c);
	int updateAdRentInfo(AdRentInfo c);
	List<AdRentInfo> getAdRentInfoAll();
}
