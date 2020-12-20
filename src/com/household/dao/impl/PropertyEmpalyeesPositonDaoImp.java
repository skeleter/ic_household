package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.household.dao.PropertyEmpalyeesPositonDao;
import com.household.pojo.AccountInfo;
import com.household.pojo.PropertyEmpalyeesPositon;
import com.household.util.C3P0Utils;

public class PropertyEmpalyeesPositonDaoImp implements PropertyEmpalyeesPositonDao {

	/**
	 * @author ty 
	 * 根据id得到职务名称，查不到返回null
	 */
	@Override
	public List<PropertyEmpalyeesPositon> getPropertyEmpalyeesPositonByPositionId(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select position_id positionId,position_name positionName from property_empalyees_positon where position_id=? ";
		BeanListHandler<PropertyEmpalyeesPositon> handler = new BeanListHandler<PropertyEmpalyeesPositon>(
				PropertyEmpalyeesPositon.class);
		try {
			return qr.query(sql, id, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @author ty 
	 * 添加职务名称,成功返回影响条数，失败返回0
	 */
	@Override
	public int addPropertyEmpalyeesPositon(PropertyEmpalyeesPositon c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "INSERT INTO property_empalyees_positon VALUES(?,?)";
		try {
			return qr.update(sql, c.getPositionId(), c.getPositionName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @author ty 
	 * 根据id删除职务名称,成功返回影响条数，失败返回0
	 */
	@Override
	public int delPropertyEmpalyeesPositonById(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM property_empalyees_positon WHERE position_id=?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @author ty 
	 * 根据名字删除职务名称,成功返回影响条数，失败返回0
	 */
	public int delPropertyEmpalyeesPositonByName(String name) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "DELETE FROM property_empalyees_positon WHERE position_name=?";
		try {
			return qr.update(sql, name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @author ty 
	 * 修改职务列表,成功返回影响条数，失败返回0
	 */
	@Override
	public int updatePropertyEmpalyeesPositon(PropertyEmpalyeesPositon c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "UPDATE property_empalyees_positon SET position_id=?,position_name=? WHERE position_id=?";
		try {
			return qr.update(sql, c.getPositionId(), c.getPositionName(), c.getPositionId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @author ty 
	 * 得到所有职务列表，查询失败返回0
	 */
	@Override
	public List<PropertyEmpalyeesPositon> getPropertyEmpalyeesPositonAll() {
		BeanListHandler<PropertyEmpalyeesPositon> handler = new BeanListHandler<PropertyEmpalyeesPositon>(
				PropertyEmpalyeesPositon.class);
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select position_id positionId,position_name positionName from property_empalyees_positon";

		try {
			return qr.query(sql, handler);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
