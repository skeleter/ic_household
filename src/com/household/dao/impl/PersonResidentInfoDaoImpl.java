package com.household.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PersonResidentInfoDao;
import com.household.pojo.PersonResidentInfo;
import com.household.util.C3P0Utils;

public class PersonResidentInfoDaoImpl implements PersonResidentInfoDao {
	
	QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override
	public List<PersonResidentInfo> getPersonResidentInfoByResidentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonResidentInfo> getPersonResidentInfoByOwnerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//住户信息增加（输入PersonResidentInfo类，返回布尔类型）
	public int addPersonResidentInfo(PersonResidentInfo c) {
		String sql = "INSERT INTO person_resident_info VALUE(NULL,?,?)";
		try {
			return qr.update(sql, c.getAmount(),c.getOwnerId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//住户信息删除（输入ID，返回布尔类型）
	public int delPersonResidentInfo(int id) {
		String sql = "DELETE FROM person_resident_info WHERE resident_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//住户信息修改（输入PersonResidentInfo类，返回布尔类型）
	public int updatePersonResidentInfo(PersonResidentInfo c) {
		String sql = "UPDATE person_resident_info SET resident_id = ?,amount = ?,owner_id = ? WHERE resident_id = ?";
		try {
			return qr.update(sql, c.getResidentId(),c.getAmount(),c.getOwnerId(),c.getResidentId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//查询所有住户信息（无输入，返回List<PersonResidentInfo>)
	public List<PersonResidentInfo> getPersonResidentInfoAll() {
		String sql = "SELECT resident_id AS residentId,amount AS amount,owner_id AS ownerId FROM person_resident_info";
		try {
			return qr.query(sql, new BeanListHandler<PersonResidentInfo>(PersonResidentInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
