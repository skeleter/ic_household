package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.SelectCommentDao;
import com.household.pojo.AdInfo;
import com.household.pojo.EquipmentInfo;
import com.household.util.C3P0Utils;

public class SelectCommentDaoImpl implements SelectCommentDao {
	
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override// EquipmentInfo查询相应ID的设备（输入ID（int），返回布尔类型）
	public EquipmentInfo getEquipmentInfoByEquipmentId(int id) {
		String sql = "SELECT equipment_id AS equipmentId,equipment_name AS equipmentName,equipment_location AS equipmentLocation,equipment_use AS equipmentUse FROM equipment_info WHERE equipment_id = ?";
		try {
			return qr.query(sql, id, new BeanHandler<EquipmentInfo>(EquipmentInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//EquipmentInfo模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
	public List<EquipmentInfo> getEquipmentInfoLikeUse(String use) {
		String sql = "SELECT equipment_id AS equipmentId,equipment_name AS equipmentName,equipment_location AS equipmentLocation,equipment_use AS equipmentUse FROM equipment_info WHERE equipment_use LIKE ?";
		try {
			String str = "%"+use+"%";
			return qr.query(sql, str, new BeanListHandler<EquipmentInfo>(EquipmentInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
	public List<EquipmentInfo> getEquipmentInfoLikeName(String name) {
		String sql = "SELECT equipment_id AS equipmentId,equipment_name AS equipmentName,equipment_location AS equipmentLocation,equipment_use AS equipmentUse FROM equipment_info WHERE equipment_name LIKE ?";
		try {
			String str = "%"+name+"%";
			return qr.query(sql, str, new BeanListHandler<EquipmentInfo>(EquipmentInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
