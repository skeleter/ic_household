package com.household.dao;

import java.util.List;

import com.household.pojo.GasmeterRechargeData;

public interface GasmeterRechargeDataDao {
	List<GasmeterRechargeData> getGasmeterRechargeDataByOwnerId(int id);
	List<GasmeterRechargeData> getGasmeterRechargeDataByGasmeterId(int id);
	int addGasmeterRechargeData(GasmeterRechargeData c);
	int delGasmeterRechargeData(GasmeterRechargeData c);
	int updateGasmeterRechargeData(GasmeterRechargeData c);
	List<GasmeterRechargeData> getGasmeterRechargeDataAll();
}
