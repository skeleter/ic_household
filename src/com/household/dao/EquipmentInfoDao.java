package com.household.dao;

import java.util.List;

import com.household.pojo.EquipmentInfo;

public interface EquipmentInfoDao {
	
	
	//增加设备数据（输入equipmentInfo对象）
	int addEquipmentInfo(EquipmentInfo c);
	
	//通过设备ID删除设备数据（输入ID（int），返回布尔类型）
	int delEquipmentInfo(int id);
	
	//修改设备数据（输入equipmentInfo对象，返回布尔类型）
	int updateEquipmentInfo(EquipmentInfo c);
	
	List<EquipmentInfo> getEquipmentInfoAll();
}
