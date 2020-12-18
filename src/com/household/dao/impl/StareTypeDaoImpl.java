package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.StareTypeDao;
import com.household.pojo.StareType;
import com.household.util.C3P0Utils;

public class StareTypeDaoImpl implements StareTypeDao {
	
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override
	public List<StareType> getStareTypeByStareTypeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//对商铺类型进行添加（输入StareType对象，输出布尔类型）
	public int addStareType(StareType c) {
		String sql = "INSERT INTO stare_type VALUES(NULL,?)";
		try {
			return qr.update(sql, c.getStareTypeName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//对商铺类型进行删除（输入ID（int），返回布尔类型）
	public int delStareType(int id) {
		String sql = "DELETE FROM stare_type WHERE stare_type_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//对商铺类型进行更改（输入StareType对象，返回布尔类型）
	public int updateStareType(StareType c) {
		String sql = "UPDATE stare_type SET stare_type_name = ? WHERE stare_type_id = ?";
		try {
			return qr.update(sql, c.getStareTypeName(),c.getStareTypeId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//对商铺类型进行查询（无输入，输出List<StareType>)
	public List<StareType> getStareTypeAll() {
		String sql = "SELECT stare_type_id AS stareTypeId,stare_type_name AS stareTypeName FROM stare_type";
		try {
			return qr.query(sql, new BeanListHandler<StareType>(StareType.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
