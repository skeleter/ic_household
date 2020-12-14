package com.household.dao;

import java.util.List;

import com.household.pojo.EquipmentInfo;

public interface SelectCommentDao {
	
	/*
	 * EquipmentInfo
	 * */
	//查询相应ID的设备（输入ID（int））
	EquipmentInfo getEquipmentInfoByEquipmentId(int id);
	//模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeUse(String use);
	//模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeName(String name);
	
	
	
	
	
}
