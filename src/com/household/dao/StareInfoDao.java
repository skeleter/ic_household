package com.household.dao;

import java.util.List;

import com.household.pojo.StareInfo;

public interface StareInfoDao {
	List<StareInfo> getStareInfoByStareId(int id);
	List<StareInfo> getStareInfoByStareTpyeId(int id);
	int addStareInfo(StareInfo c);
	int delStareInfo(StareInfo c);
	int updateStareInfo(StareInfo c);
	List<StareInfo> getStareInfoAll();
}
