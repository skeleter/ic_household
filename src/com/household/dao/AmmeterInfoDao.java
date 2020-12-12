package com.household.dao;

import java.util.List;
import com.household.pojo.AmmeterInfo;

public interface AmmeterInfoDao {
	List<AmmeterInfo> getAmmeterInfoByAmmeterId(int id);
	int addAmmeterInfo(AmmeterInfo c);
	int delAmmeterInfo(AmmeterInfo c);
	int updateAmmeterInfo(AmmeterInfo c);
	List<AmmeterInfo> getAmmeterInfoAll();
}
