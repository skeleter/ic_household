package com.household.dao;

import java.util.List;

import com.household.pojo.WatermeterRechargeData;

public interface WatermeterRechargeDataDao {
	List<WatermeterRechargeData> getWatermeterRechargeDataByOwnerId(int id);
	List<WatermeterRechargeData> getWatermeterRechargeDataByWatermeterId(int id);
	int addWatermeterRechargeData(WatermeterRechargeData c);
	int delWatermeterRechargeData(WatermeterRechargeData c);
	int updateWatermeterRechargeData(WatermeterRechargeData c);
	List<WatermeterRechargeData> getWatermeterRechargeDataAll();
}
