package com.household.dao;

import java.util.List;

import com.household.pojo.WatermeterUsedData;

public interface WatermeterUsedDataDao {
	List<WatermeterUsedData> getWatermeterUsedDataByWatermeterId(int id);
	int addWatermeterUsedData(WatermeterUsedData c);
	int delWatermeterUsedData(WatermeterUsedData c);
	int updateWatermeterUsedData(WatermeterUsedData c);
	List<WatermeterUsedData> getWatermeterUsedDataAll();
}
