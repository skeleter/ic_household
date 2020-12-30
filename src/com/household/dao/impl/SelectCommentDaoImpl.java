package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.household.dao.SelectCommentDao;
import com.household.pojo.EquipmentInfo;
import com.household.pojo.HouseInfo;
import com.household.pojo.HouseInfoAll;
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

	@Override
	public List<HouseInfoAll> getAllHouseInfoAll() {
		// TODO Auto-generated method stub
		BeanListHandler<HouseInfoAll> handler = new BeanListHandler<HouseInfoAll>(HouseInfoAll.class);
		//String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";
		String sql = "SELECT i.`house_id` houseId,i.`building` building,i.`floor` FLOOR,i.`room` room,i.`house_type_id` houseTypeId,i.`resident_id` residentId ,t.`house_type_name` houseTypeName,IF(i.`resident_id` IS NOT NULL,'是','否') AS haven FROM house_info i,house_type t WHERE  i.`house_type_id`=t.`house_type_id`";
		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public List<HouseInfo> getHouseInfoIs(int i) {
		// TODO Auto-generated method stub
		BeanListHandler<HouseInfo> handler = new BeanListHandler<HouseInfo>(HouseInfo.class);
		String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info i WHERE i.`house_id`=? ";
		try {
			return qr.query(sql, i,handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<HouseInfoAll> getAllHouseInfoAllByType(String type) {
		// TODO Auto-generated method stub
		BeanListHandler<HouseInfoAll> handler = new BeanListHandler<HouseInfoAll>(HouseInfoAll.class);
		//String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";
		String sql = "SELECT i.`house_id` houseId,i.`building` building,i.`floor` FLOOR,i.`room` room,i.`house_type_id` houseTypeId,i.`resident_id` residentId ,t.`house_type_name` houseTypeName,"+
		"IF(i.`resident_id` IS NOT NULL,'是','否') AS haven FROM house_info i,house_type t WHERE  i.`house_type_id`=t.`house_type_id` AND t.`house_type_name` LIKE CONCAT('%',?,'%')";
		try {
			return qr.query(sql, type,handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<HouseInfoAll> getAllHouseInfoAllByFloor(int floor) {
		// TODO Auto-generated method stub
		BeanListHandler<HouseInfoAll> handler = new BeanListHandler<HouseInfoAll>(HouseInfoAll.class);
		//String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";
		String sql = "SELECT i.`house_id` houseId,i.`building` building,i.`floor` FLOOR,i.`room` room,i.`house_type_id` houseTypeId,i.`resident_id` residentId ,t.`house_type_name` houseTypeName,"+
		"IF(i.`resident_id` IS NOT NULL,'是','否') AS haven FROM house_info i,house_type t WHERE  i.`house_type_id`=t.`house_type_id` AND i.`floor`=?";
		try {
			return qr.query(sql,floor,handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<HouseInfoAll> getAllHouseInfoAllByResident(boolean resident) {
		// TODO Auto-generated method stub
		String flag="";
		if(resident){
			flag="NOT";
		}else{
			flag="";
		}
		BeanListHandler<HouseInfoAll> handler = new BeanListHandler<HouseInfoAll>(HouseInfoAll.class);
		//String sql = "SELECT  house_id houseId,building building,FLOOR FLOOR,room room,house_type_id houseTypeId,resident_id residentId FROM house_info";
		String sql = "SELECT i.`house_id` houseId,i.`building` building,i.`floor` FLOOR,i.`room` room,i.`house_type_id` houseTypeId,i.`resident_id` residentId ,t.`house_type_name` houseTypeName,"+
		"IF(i.`resident_id` IS NOT NULL,'是','否') AS haven FROM house_info i,house_type t WHERE  i.`house_type_id`=t.`house_type_id` AND i.`resident_id` IS "+flag+" NULL";
		try {
			return qr.query(sql,handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
