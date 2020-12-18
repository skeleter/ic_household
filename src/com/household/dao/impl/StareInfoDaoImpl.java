package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.StareInfoDao;
import com.household.pojo.StareInfo;
import com.household.util.C3P0Utils;

public class StareInfoDaoImpl implements StareInfoDao {
	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	

	@Override
	public List<StareInfo> getStareInfoByStareId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StareInfo> getStareInfoByStareTpyeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//对商铺信息进行增加（输入StareInfo对象，返回布尔类型）
	public int addStareInfo(StareInfo c) {
		String sql = "INSERT INTO stare_info VALUES(NULL,?,?,?,?)";
		try {
			return qr.update(sql, c.getStareTpyeId(),c.getStareLocation(),c.getStareName(),c.getRent());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//对商铺信息进行删除（输入ID（int），舒服布尔类型）
	public int delStareInfo(int id) {
		String sql = "DELETE FROM stare_info WHERE stare_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//对商铺信息进行修改（输入StareInfo对象，返回布尔类型）
	public int updateStareInfo(StareInfo c) {
		String sql = "UPDATE stare_info SET stare_id = ?,stare_tpye_id = ?,stare_location = ?,stare_name = ?,rent = ? WHERE stare_id = ?";
		try {
			return qr.update(sql,c.getStareId(), c.getStareTpyeId(),c.getStareLocation(),c.getStareName(),c.getRent(),c.getStareId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<StareInfo> getStareInfoAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//通过连表查询，查询已经租出去的商铺（无输入，返回List<StareInfo>）
	public List<StareInfo> getStareInfoByOut() {
		List<StareInfo> list = null;
		String sql = "SELECT stare_info.stare_id AS stareId,stare_info.stare_tpye_id AS stareTpyeId,stare_info.stare_location AS stareLocation,stare_info.stare_name AS stareName,stare_info.rent AS rent FROM stare_info,stare_rent_info WHERE stare_info.stare_id = stare_rent_info.stare_id";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfo>(StareInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
