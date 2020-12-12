package com.household.dao;

import java.util.List;
import com.household.pojo.AmmeterUsedData;

public interface AmmeterUsedDataDao {
	List<AmmeterUsedData> getAmmeterUsedDataByAmmenterId(int id);
	int addAmmeterUsedData(AmmeterUsedData c);
	int delAmmeterUsedData(AmmeterUsedData c);
	int updateAmmeterUsedData(AmmeterUsedData c);
	List<AmmeterUsedData> getAmmeterUsedDataAll();
}
