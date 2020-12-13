package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.household.dao.EquipmentInfoDao;
import com.household.pojo.EquipmentInfo;
import com.household.util.C3P0Utils;

public class EquipmentInfoDaoImpl implements EquipmentInfoDao {
	
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());


	@Override//增加设备数据（输入equipmentInfo对象）
	public int addEquipmentInfo(EquipmentInfo c) {
		String sql = "INSERT INTO equipment_info VALUE(null,?,?,?)";
		try {
			return qr.update(sql, c.getEquipmentName(),c.getEquipmentLocation(),c.getEquipmentUse());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//通过设备ID删除设备数据（输入ID（int），返回布尔类型）
	public int delEquipmentInfo(int id) {
		String sql = "DELETE FROM `equipment_info` WHERE equipment_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//修改设备数据（输入equipmentInfo对象，返回布尔类型）
	public int updateEquipmentInfo(EquipmentInfo c) {
		String sql = "UPDATE equipment_info SET equipment_id = ?,equipment_name = ?,equipment_location = ?,equipment_use = ? WHERE equipment_id = ?";
		try {
			return qr.update(sql, c.getEquipmentId(),c.getEquipmentName(),c.getEquipmentLocation(),c.getEquipmentUse(),c.getEquipmentId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<EquipmentInfo> getEquipmentInfoAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
