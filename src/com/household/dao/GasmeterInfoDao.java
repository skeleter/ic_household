package com.household.dao;

import java.util.List;

import com.household.pojo.GasmeterInfo;

public interface GasmeterInfoDao {
	List<GasmeterInfo> getGasmeterInfoByGasmeterId(int id);
	List<GasmeterInfo> getGasmeterInfoByHouseId(int id);
	int addGasmeterInfo(GasmeterInfo c);
	int delGasmeterInfo(GasmeterInfo c);
	int updateGasmeterInfo(GasmeterInfo c);
	List<GasmeterInfo> getGasmeterInfoAll();
}
