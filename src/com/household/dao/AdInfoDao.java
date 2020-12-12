package com.household.dao;

import java.util.List;

import com.household.pojo.AdInfo;

public interface AdInfoDao {
	List<AdInfo> getAdInfoByAdId(int id);
	List<AdInfo> getAdInfoByAdTypeId(int id);
	int addAdInfo(AdInfo c);
	int delAdInfo(AdInfo c);
	int updateAdInfo(AdInfo c);
	List<AdInfo> getAdInfoAll();
}