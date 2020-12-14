package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.household.dao.AdInfoDao;
import com.household.pojo.AdInfo;
import com.household.service.AdInfoManagerService;
import com.household.service.impl.AdInfoManagerServiceImpl;
import com.household.util.C3P0Utils;

public class AdInfoDaoImpl implements AdInfoDao {
	
	//123456789
	//987654321
	//11
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override//通过ID查询相应的广告位（输入广告位ID（int），返回AdInfo对象）
	public AdInfo getAdInfoByAdId(int id) {
		String sql = "SELECT ad_id AS adId,ad_type_id AS adTypeId,ad_location AS adLocation,rent AS rent FROM ad_info WHERE ad_id = ?";
		try {
			return qr.query(sql, id, new BeanHandler<AdInfo>(AdInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<AdInfo> getAdInfoByAdTypeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//添加广告详情
	public int addAdInfo(AdInfo c) {
		String sql = "INSERT INTO `ad_info` VALUE(null,?,?,?)";
		try {
			return qr.update(sql, c.getAdTypeId(),c.getAdLocation(),c.getRent());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//通过ID删除相应的广告位（输入广告位ID（int），返回布尔类型）
	public int delAdInfo(int id) {
		String sql = "DELETE FROM `ad_info` WHERE ad_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//修改广告位的信息（输入AdInfo对象，返回布尔类型)
	public int updateAdInfo(AdInfo c) {
		String sql = "UPDATE `ad_info` SET ad_type_id = ?,ad_location = ?,rent = ? WHERE ad_id = ?";
		try {
			return qr.update(sql, c.getAdTypeId(),c.getAdLocation(),c.getRent(),c.getAdId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<AdInfo> getAdInfoAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//模糊查询位置相应的广告位（输入String，返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByLike(String str) {
		String sql = "SELECT ad_id AS adId,ad_type_id AS adTypeId,ad_location AS adLocation,rent AS rent FROM ad_info WHERE ad_location LIKE ?";
		try {
			String str2 = "%"+str+"%";
			return qr.query(sql, str2, new BeanListHandler<AdInfo>(AdInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//模糊查询广告位类型相应的广告位（输入String，返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByLikeTypeId(Object[] arr) {
		String str = "";
		if (arr.length >= 1) {
			for (int i = 0; i < arr.length; i++) {
				str+="?,";
			}
			str = str.substring(0, str.length()-1);
		} else {
			str = "?";
		}
		
		String sql = "SELECT ad_id AS adId,ad_type_id AS adTypeId,ad_location AS adLocation,rent AS rent FROM ad_info WHERE ad_type_id IN ("+str+")";

		try {
			 return qr.query(sql, arr, new BeanListHandler<AdInfo>(AdInfo.class));
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override//查询指定租金区间的广告位（输入两个float，返回返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByBetween(Float a, Float b) {
		String sql = "SELECT ad_id AS adId,ad_type_id AS adTypeId,ad_location AS adLocation,rent AS rent FROM ad_info WHERE rent BETWEEN ? AND ?";
		
		Float x = null;
		Float y = null;
		if (a < b) {
			x = a;
			y = b;
		} else if(a > b) {
			x = b;
			y = a;
		}else{
			x = a;
			y = b;
		}
		
		try {
			 return qr.query(sql, new BeanListHandler<AdInfo>(AdInfo.class), x , y);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
