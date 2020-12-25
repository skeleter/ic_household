package com.household.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.household.dao.AccountInfoDao;
import com.household.pojo.AccountInfo;
import com.household.util.C3P0Utils;

public class AccountInfoDaoImp implements AccountInfoDao{

	
	/**
	 * @author ty
	 *根据姓名查询用户，查到返回对象，查不到返回null
	 */

	@SuppressWarnings("deprecation")
	@Override
	public AccountInfo getAccountInfoByUserName(String name) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select user_id userId,user_name userName, user_password userPassword, user_type userType from account_info where user_name=? ";
		BeanHandler<AccountInfo> handler = new BeanHandler<AccountInfo>(AccountInfo.class);
		try {		
			 return qr.query(sql, name, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	 * @author ty
	 *根据姓名和密码查询用户，查到返回对象，查不到返回null
	 */

	@SuppressWarnings("deprecation")
	public AccountInfo getAccountInfoByUserNameAndPassWord(String name,String password) {
		String[] info = {name,password};
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select user_id userId,user_name userName, user_password userPassword, user_type userType from account_info where user_name=? and user_password=? ";
		BeanHandler<AccountInfo> handler = new BeanHandler<AccountInfo>(AccountInfo.class);
		try {		
			 return qr.query(sql,info, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * @author ty
	 *根据姓名查询用户类型，查到返回对象，查不到返回null
	 */

	@SuppressWarnings("deprecation")
	public AccountInfo getAccountInfoByUserNameToType(String name) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select user_id userId,user_name userName, user_password userPassword, user_type userType from account_info where user_name=?";
		BeanHandler<AccountInfo> handler = new BeanHandler<AccountInfo>(AccountInfo.class);
		try {		
			 return qr.query(sql,name, handler);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	/**
	 * @author ty
	 *添加用户，成功返回影响条数，失败返回0
	 */
	@Override
	public int addAccountInfo(AccountInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql ="INSERT INTO account_info VALUES(?,?,?,?)";
		try {
		return	qr.update(sql, c.getUserId(),c.getUserName(),c.getUserPassword(),c.getUserType());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	
	/**
	 * @author ty
	 *删除用户，成功返回影响条数，失败返回0
	 */
	@Override
	public int delAccountInfoById(int id) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql ="DELETE FROM account_info WHERE user_id=?";
		try {
		return	qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	
	/**
	 * @author ty
	 *修改用户，成功返回影响条数，失败返回0
	 */
	@Override
	public int updateAccountInfo(AccountInfo c) {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql ="UPDATE account_info SET user_id=?,user_name=?,user_password=?,user_type=? WHERE user_id=?";
		try {
		return	qr.update(sql,c.getUserId(),c.getUserName(),c.getUserPassword(),c.getUserType(),c.getUserId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	
	/**
	 * @author ty
	 *返回所有对象
	 */
	@Override
	public List<Map<String, Object>> getAccountInfoAll() {
		MapListHandler handler =new MapListHandler();
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql ="select user_id userId,user_name userName, user_password userPassword, user_type userType from account_info";
		
		try {
			return qr.query(sql, handler);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

}
