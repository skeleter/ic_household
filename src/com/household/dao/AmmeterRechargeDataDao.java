package com.household.dao;

import java.util.List;
import com.household.pojo.AmmeterRechargeData;

public interface AmmeterRechargeDataDao {
	List<AmmeterRechargeData> getAmmeterRechargeDataByAmmeterId(int id);
	List<AmmeterRechargeData> getAmmeterRechargeDataByOwnerId(int id);
	int addAmmeterRechargeData(AmmeterRechargeData c);
	int delAmmeterRechargeData(AmmeterRechargeData c);
	int updateAmmeterRechargeData(AmmeterRechargeData c);
	List<AmmeterRechargeData> getAmmeterRechargeDataAll();
}
