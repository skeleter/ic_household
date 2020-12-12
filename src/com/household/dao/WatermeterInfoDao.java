package com.household.dao;

import java.util.List;

import com.household.pojo.WatermeterInfo;

public interface WatermeterInfoDao {
	List<WatermeterInfo> getWatermeterInfoByWatermeterId(int id);
	List<WatermeterInfo> getWatermeterInfoByHouseId(int id);
	int addWatermeterInfo(WatermeterInfo c);
	int delWatermeterInfo(WatermeterInfo c);
	int updateWatermeterInfo(WatermeterInfo c);
	List<WatermeterInfo> getWatermeterInfoAll();
}
