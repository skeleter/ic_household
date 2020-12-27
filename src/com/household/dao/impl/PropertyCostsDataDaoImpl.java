package com.household.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PropertyCostsDataDao;
import com.household.pojo.PropertyCostsData;
import com.household.util.C3P0Utils;

public class PropertyCostsDataDaoImpl implements PropertyCostsDataDao {

	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
	@Override//按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByHouseId(int id) {
		String sql = "SELECT costs_id AS costsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_costs AS propertyCosts,owner_id AS ownerId,payment_time AS paymentTime"
				+ " FROM property_costs_data WHERE house_id = ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyCostsData>(PropertyCostsData.class), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByResidentId(int id) {
		String sql = "SELECT costs_id AS costsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_costs AS propertyCosts,owner_id AS ownerId,payment_time AS paymentTime"
				+ " FROM property_costs_data WHERE resident_id = ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyCostsData>(PropertyCostsData.class), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//物业费缴费记录增加（输入PropertyCostsData对象，返回布尔类型）
	public int addPropertyCostsData(PropertyCostsData c) {
		String sql = "INSERT INTO property_costs_data VALUE(NULL,?,?,?,?,?)";
		try {
			return qr.update(sql, c.getHouseId(),c.getResidentId(),c.getPropertyCosts(),c.getOwnerId(),c.getPaymentTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//物业费缴费记录删除（输入ID(int),返回布尔类型）
	public int delPropertyCostsData(int id) {
		String sql = "DELETE FROM property_costs_data WHERE costs_id = ?";
		try {
			return qr.update(sql,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//物业缴费记录修改（输入PropertyCostsData对象，返回布尔类型）
	public int updatePropertyCostsData(PropertyCostsData c) {
		String sql = "UPDATE property_costs_data SET costs_id = ?,house_id = ?,resident_id = ?,property_costs = ?,owner_id = ?,payment_time = ? WHERE costs_id = ?";
		try {
			return qr.update(sql,c.getCostsId(),c.getHouseId(),c.getResidentId(),c.getPropertyCosts(),c.getOwnerId(),c.getPaymentTime(),c.getCostsId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//全部物业缴费记录查询（无输入，返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataAll() {
		String sql = "SELECT costs_id AS costsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_costs AS propertyCosts,owner_id AS ownerId,payment_time AS paymentTime"
				+ " FROM property_costs_data";
		try {
			return qr.query(sql, new BeanListHandler<PropertyCostsData>(PropertyCostsData.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//按照一定时间区间查询缴费记录（输入date，date，返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByTime(Date time1, Date time2) {
		String sql = "SELECT costs_id AS costsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_costs AS propertyCosts,owner_id AS ownerId,payment_time AS paymentTime"
				+ " FROM property_costs_data WHERE payment_time BETWEEN ? AND ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyCostsData>(PropertyCostsData.class), time1,time2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
