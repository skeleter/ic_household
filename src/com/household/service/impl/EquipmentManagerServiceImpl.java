package com.household.service.impl;

import java.util.List;

import com.household.dao.EquipmentInfoDao;
import com.household.dao.SelectCommentDao;
import com.household.dao.impl.EquipmentInfoDaoImpl;
import com.household.dao.impl.SelectCommentDaoImpl;
import com.household.pojo.EquipmentInfo;
import com.household.service.EquipmentManagerService;

public class EquipmentManagerServiceImpl implements EquipmentManagerService {
	EquipmentInfoDao eq = new EquipmentInfoDaoImpl();
	SelectCommentDao sc = new SelectCommentDaoImpl();

	@Override//增加设备数据（输入equipmentInfo对象，返回布尔类型）
	public boolean addEquipmentInfo(EquipmentInfo c) {
		int i = eq.addEquipmentInfo(c);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//修改设备数据（输入equipmentInfo对象，返回布尔类型）
	public boolean updateEquipmentInfo(EquipmentInfo c) {
		int i = eq.updateEquipmentInfo(c);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//通过设备ID删除设备数据（输入ID（int），返回布尔类型）
	public boolean delEquipmentInfo(int id) {
		int i = eq.delEquipmentInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//查询相应ID的设备（输入ID（int），返回布尔类型）
	public EquipmentInfo getEquipmentInfoByEquipmentId(int id) {
		EquipmentInfo eq = sc.getEquipmentInfoByEquipmentId(id);
		return eq;
	}

	@Override//模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
	public List<EquipmentInfo> getEquipmentInfoLikeName(String name) {
		List<EquipmentInfo> list = sc.getEquipmentInfoLikeName(name);
		return list;
	}

	@Override//模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
	public List<EquipmentInfo> getEquipmentInfoLikeUse(String use) {
		List<EquipmentInfo> list = sc.getEquipmentInfoLikeUse(use);
		return list;
	}
	
	
	
	
	
	
	

}
