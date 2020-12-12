package com.household.dao;

import java.util.List;

import com.household.pojo.GasmeterUsedData;

public interface GasmeterUsedDataDao {
	List<GasmeterUsedData> getGasmeterUsedDataByGasmeterId(int id);
	int addGasmeterUsedData(GasmeterUsedData c);
	int delGasmeterUsedData(GasmeterUsedData c);
	int updateGasmeterUsedData(GasmeterUsedData c);
	List<GasmeterUsedData> getGasmeterUsedDataAll();
}
