package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.StareInfoDao;
import com.household.pojo.StareInfo;
import com.household.pojo.StareInfoAll;
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

	@Override//综合查询商铺详细信息，三个表连在一起查询（无输入，返回List<StareInfoAll>)
	public List<StareInfoAll> getStareInfoAll() {
		List<StareInfoAll> list = null;
		String sql = "SELECT  stare_info.`stare_id` AS stareId,stare_type.`stare_type_name` AS stareTypeName,stare_info.`stare_location` AS stareLocation,stare_info.`stare_name` AS stareName,stare_info.`rent` AS rent,stare_rent_info.`stare_time_start` AS stareTimeStart,stare_rent_info.`stare_time_end` AS stareTimeEnd,stare_rent_info.`stare_owner_name`AS stareOwnerName,stare_rent_info.`stare_owner_telephone` AS stareOwnerTelephone FROM stare_info INNER JOIN stare_rent_info ON stare_info.`stare_id` = stare_rent_info.`stare_id` INNER JOIN stare_type ON stare_info.`stare_tpye_id` = stare_type.`stare_type_id`";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfoAll>(StareInfoAll.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
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

	@Override//通过连表查询，查询未租出去的商铺（无输入，返回List<StareInfo>）
	public List<StareInfo> getStareInfoByNoOut() {
		List<StareInfo> list = null;
		String sql = "SELECT stare_id AS stareId,stare_tpye_id AS stareTpyeId,stare_location AS stareLocation,stare_name AS stareName,rent AS rent FROM stare_info WHERE stare_info.`stare_id` NOT IN(SELECT stare_id FROM stare_rent_info)";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfo>(StareInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//通过模糊名字对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	public List<StareInfoAll> getStareInfoAllByLikeName(String name) {
		List<StareInfoAll> list = null;
		String sql = "SELECT stare_info.stare_id AS stareId,stare_type.stare_type_name AS stareTypeName,stare_info.stare_location AS stareLocation,stare_info.stare_name AS stareName,stare_info.rent AS rent,stare_rent_info.stare_time_start AS stareTimeStart,stare_rent_info.stare_time_end AS stareTimeEnd,stare_rent_info.stare_owner_name AS stareOwnerName,stare_rent_info.stare_owner_telephone AS stareOwnerTelephone FROM stare_info INNER JOIN stare_rent_info ON stare_info.stare_id = stare_rent_info.stare_id INNER JOIN stare_type ON stare_info.stare_tpye_id = stare_type.stare_type_id WHERE stare_info.stare_name LIKE CONCAT('%',?,'%')";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfoAll>(StareInfoAll.class), name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//通过模糊店铺类型对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	public List<StareInfoAll> getStareInfoAllByTypeName(String typeName) {
		List<StareInfoAll> list = null;
		String sql = "SELECT stare_info.stare_id AS stareId,stare_type.stare_type_name AS stareTypeName,stare_info.stare_location AS stareLocation,stare_info.stare_name AS stareName,stare_info.rent AS rent,stare_rent_info.stare_time_start AS stareTimeStart,stare_rent_info.stare_time_end AS stareTimeEnd,stare_rent_info.stare_owner_name AS stareOwnerName,stare_rent_info.stare_owner_telephone AS stareOwnerTelephone FROM stare_info INNER JOIN stare_rent_info ON stare_info.stare_id = stare_rent_info.stare_id INNER JOIN stare_type ON stare_info.stare_tpye_id = stare_type.stare_type_id WHERE stare_type.stare_type_name LIKE CONCAT('%',?,'%')";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfoAll>(StareInfoAll.class), typeName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//通过区间租金对商铺详细信息进行查询，三个表连在一起查询（输入float（Min），float（Max），返回List<StareInfoAll>)
	public List<StareInfoAll> getStareInfoAllByBetween(Float min, Float max) {
		List<StareInfoAll> list = null;
		String sql = "SELECT stare_info.stare_id AS stareId,stare_type.stare_type_name AS stareTypeName,stare_info.stare_location AS stareLocation,stare_info.stare_name AS stareName,stare_info.rent AS rent,stare_rent_info.stare_time_start AS stareTimeStart,stare_rent_info.stare_time_end AS stareTimeEnd,stare_rent_info.stare_owner_name AS stareOwnerName,stare_rent_info.stare_owner_telephone AS stareOwnerTelephone FROM stare_info INNER JOIN stare_rent_info ON stare_info.stare_id = stare_rent_info.stare_id INNER JOIN stare_type ON stare_info.stare_tpye_id = stare_type.stare_type_id WHERE stare_info.rent BETWEEN ? AND ?";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfoAll>(StareInfoAll.class), min,max);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//通过模糊位置对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	public List<StareInfoAll> getStareInfoAllByLocation(String location) {
		List<StareInfoAll> list = null;
		String sql = "SELECT stare_info.stare_id AS stareId,stare_type.stare_type_name AS stareTypeName,stare_info.stare_location AS stareLocation,stare_info.stare_name AS stareName,stare_info.rent AS rent,stare_rent_info.stare_time_start AS stareTimeStart,stare_rent_info.stare_time_end AS stareTimeEnd,stare_rent_info.stare_owner_name AS stareOwnerName,stare_rent_info.stare_owner_telephone AS stareOwnerTelephone FROM stare_info INNER JOIN stare_rent_info ON stare_info.stare_id = stare_rent_info.stare_id INNER JOIN stare_type ON stare_info.stare_tpye_id = stare_type.stare_type_id WHERE stare_info.stare_location LIKE CONCAT('%',?,'%')";
		try {
			list = qr.query(sql, new BeanListHandler<StareInfoAll>(StareInfoAll.class), location);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
