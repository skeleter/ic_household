package com.household.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PropertyArrearsDataDao;
import com.household.pojo.PropertyArrearsData;
import com.household.util.C3P0Utils;

public class PropertyArrearsDataDaoImpl implements PropertyArrearsDataDao {
	
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override
	public List<PropertyArrearsData> getPropertyArrearsDataByHouseId(int id) {
		String sql = "SELECT arrears_id AS arrearsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_arrears AS propertyArrears,property_time AS propertyTime FROM "
				+ "property_arrears_data WHERE house_id = ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyArrearsData>(PropertyArrearsData.class), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
	public List<PropertyArrearsData> getPropertyArrearsDataByResidentId(int id) {
		String sql = "SELECT arrears_id AS arrearsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_arrears AS propertyArrears,property_time AS propertyTime FROM "
				+ "property_arrears_data WHERE resident_id = ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyArrearsData>(PropertyArrearsData.class), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//物业费欠费记录增加（输入PropertyArrearsData对象，返回布尔类型）
	public int addPropertyArrearsData(PropertyArrearsData c) {
		String sql = "INSERT INTO property_arrears_data VALUE(NULL,?,?,?,?)";
		try {
			return qr.update(sql, c.getHouseId(),c.getResidentId(),c.getPropertyArrears(),c.getPropertyTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//物业费欠费记录删除（输入ID(int),返回布尔类型）
	public int delPropertyArrearsData(int id) {
		String sql = "DELETE FROM property_arrears_data WHERE arrears_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//物业欠费记录修改（输入PropertyArrearsData对象，返回布尔类型）
	public int updatePropertyArrearsData(PropertyArrearsData c) {
		String sql = "UPDATE property_arrears_data SET arrears_id = ?,house_id = ?,resident_id = ?,property_arrears = ?,property_time = ? WHERE arrears_id = ?";
		try {
			return qr.update(sql, c.getArrearsId(),c.getHouseId(),c.getResidentId(),c.getPropertyArrears(),c.getPropertyTime(),c.getArrearsId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//查询所有
	public List<PropertyArrearsData> getPropertyArrearsDataAll() {
		String sql = "SELECT arrears_id AS arrearsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_arrears AS propertyArrears,property_time AS propertyTime FROM "
				+ "property_arrears_data";
		try {
			return qr.query(sql, new BeanListHandler<PropertyArrearsData>(PropertyArrearsData.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//通过欠费时间段查询欠费记录（输入date，date，返回List<PropertyArrearsData>)
	public List<PropertyArrearsData> getPropertyArrearsDataByTime(Date time1, Date time2) {
		String sql = "SELECT arrears_id AS arrearsId,house_id AS houseId,resident_id AS residentId,"
				+ "property_arrears AS propertyArrears,property_time AS propertyTime FROM "
				+ "property_arrears_data WHERE property_time BETWEEN ? AND ?";
		try {
			return qr.query(sql, new BeanListHandler<PropertyArrearsData>(PropertyArrearsData.class), time1,time2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
