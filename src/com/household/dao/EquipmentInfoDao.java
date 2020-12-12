package com.household.dao;

import java.util.List;

import com.household.pojo.EquipmentInfo;

public interface EquipmentInfoDao {
	List<EquipmentInfo> getEquipmentInfoByEquipmentId(int id);
	int addEquipmentInfo(EquipmentInfo c);
	int delEquipmentInfo(EquipmentInfo c);
	int updateEquipmentInfo(EquipmentInfo c);
	List<EquipmentInfo> getEquipmentInfoAll();
}
