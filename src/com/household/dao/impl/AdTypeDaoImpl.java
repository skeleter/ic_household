package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.AdTypeDao;
import com.household.pojo.AdInfo;
import com.household.pojo.AdType;
import com.household.util.C3P0Utils;

public class AdTypeDaoImpl implements AdTypeDao {
	
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());


	@Override//添加广告类型
	public int addAdType(String str) {
		String sql = "insert into ad_type values(null,?)";
		try {
			return qr.update(sql, str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//通过id删除广告类型
	public int delAdType(int id) {
		String sql = "DELETE FROM `ad_type` WHERE ad_type_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//修改广告类型
	public int updateAdType(AdType c) {
		String sql = "UPDATE ad_type SET ad_type_name=? WHERE ad_type_id = ?";
		try {
			return qr.update(sql, c.getAdTypeName(), c.getAdTypeId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//查询所有广告类型
	public List<AdType> getAdTypeAll() {
		List<AdType> list = null;
		String sql = "select ad_type_id as adTypeId,ad_type_name as adTypeName from ad_type";
		try {
			list = qr.query(sql, new BeanListHandler<AdType>(AdType.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//通过广告类型查询id
	public AdType getAdTypeByAdTypeName(String str) {	
		String sql = "SELECT ad_type_id AS adTypeId,ad_type_name AS adTypeName FROM ad_type WHERE ad_type_name = ?";
		try {
			 return qr.query(sql, str, new BeanHandler<AdType>(AdType.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//通过id查询广告类型
	public AdType getAdTypeByAdTypeId(int id) {
		String sql = "SELECT ad_type_id AS adTypeId,ad_type_name AS adTypeName FROM ad_type WHERE ad_type_name = ?";
		try {
			 return qr.query(sql, id, new BeanHandler<AdType>(AdType.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//通过广告类型模糊查询
	public List<AdType> getAdTypeLikeTypeName(String str) {
		String sql = "SELECT ad_type_id AS adTypeId,ad_type_name FROM ad_type WHERE ad_type_name LIKE ?";
		try {
			String str2 = "%"+str+"%";
			return qr.query(sql, str2, new BeanListHandler<AdType>(AdType.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
