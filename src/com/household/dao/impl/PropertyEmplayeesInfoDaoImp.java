package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PropertyEmplayeesInfoDao;
import com.household.pojo.PropertyEmplayeesInfo;
import com.household.util.C3P0Utils;

public class PropertyEmplayeesInfoDaoImp implements PropertyEmplayeesInfoDao{

	
	/**
	 * @author ty 
	 * 根据员工id得到职务列表，查不到返回null
	 */
	@Override
	public List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByEmplayeeId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select emplayee_id emplayeeId,position_id positionId,emplayee_name emplayeeName from property_emplayees_info where emplayee_id=? ";
		BeanListHandler<PropertyEmplayeesInfo> handler = new BeanListHandler<PropertyEmplayeesInfo>(
				PropertyEmplayeesInfo.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	 * @author ty 
	 * 根据职务id得到职务列表，查不到返回null
	 */
	@Override
	public List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByPositionId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select emplayee_id emplayeeId,position_id positionId,emplayee_name emplayeeName from property_emplayees_info where position_id=? ";
		BeanListHandler<PropertyEmplayeesInfo> handler = new BeanListHandler<PropertyEmplayeesInfo>(
				PropertyEmplayeesInfo.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	 * @author ty 
	 * 添加职务表,成功返回影响条数，失败返回0
	 */
	@Override
	public int addPropertyEmplayeesInfo(PropertyEmplayeesInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO property_emplayees_info VALUES(?,?,?)";
		try {
			return qr.update(sql, c.getEmplayeeId(), c.getPositionId(),c.getEmplayeeName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	/**
	 * @author ty 
	 * 根据员工id删除职务名称,成功返回影响条数，失败返回0
	 */
	@Override
	public int delPropertyEmplayeesInfoByEmplayeeId(int eid) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM property_emplayees_info WHERE emplayee_id=?";
		try {
			return qr.update(sql, eid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	/**
	 * @author ty 
	 * 根据职务id删除职务名称,成功返回影响条数，失败返回0
	 * @return 
	 */
	@Override
	public int delPropertyEmplayeesInfoByPositionId(int pid) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM property_emplayees_info WHERE position_id=?";
		try {
			return qr.update(sql, pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @author ty 
	 * 根据姓名删除职务名称,成功返回影响条数，失败返回0
	 * @return 
	 */
	@Override
	public int delPropertyEmplayeesInfoByName(String name) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM property_emplayees_info WHERE emplayee_name=?";
		try {
			return qr.update(sql, name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	/**
	 * @author ty 
	 * 修改人员职务列表,成功返回影响条数，失败返回0
	 */
	@Override
	public int updatePropertyEmplayeesInfo(PropertyEmplayeesInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE property_emplayees_info SET emplayee_id=?,position_id=?,emplayee_name=? WHERE emplayee_id=?";
		try {
			return qr.update(sql,c.getEmplayeeId(),c.getPositionId(),c.getEmplayeeName(),c.getEmplayeeId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	/**
	 * @author ty 
	 * 得到所有人员职务列表，查询失败返回0
	 */
	@Override
	public List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoAll() {
		BeanListHandler<PropertyEmplayeesInfo> handler = new BeanListHandler<PropertyEmplayeesInfo>(
				PropertyEmplayeesInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select emplayee_id emplayeeId,position_id positionId,emplayee_name emplayeeName from property_emplayees_info";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	
	
	/**
	 * @author ty 
	 * 根据名字模糊查询
	 */
	@Override
	public List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByName(String name) {
		BeanListHandler<PropertyEmplayeesInfo> handler = new BeanListHandler<PropertyEmplayeesInfo>(
				PropertyEmplayeesInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT emplayee_id emplayeeId,position_id positionId,emplayee_name emplayeeName FROM property_emplayees_info WHERE emplayee_name LIKE CONCAT('%',?,'%')";

		try {
			return qr.query(sql, handler,name);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	
	/**
	 * @author ty 
	 * 根据职业模糊查询
	 */
	@Override
	public List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByPosition(String position) {
		BeanListHandler<PropertyEmplayeesInfo> handler = new BeanListHandler<PropertyEmplayeesInfo>(
				PropertyEmplayeesInfo.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "SELECT emplayee_id emplayeeId,position_id positionId,emplayee_name emplayeeName FROM property_emplayees_info WHERE position_id IN (SELECT position_id positionId FROM property_empalyees_positon WHERE position_name LIKE CONCAT('%',?,'%'))";

		try {
			return qr.query(sql, handler,position);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
