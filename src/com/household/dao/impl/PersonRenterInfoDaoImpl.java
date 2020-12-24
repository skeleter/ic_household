package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PersonRenterInfoDao;
import com.household.pojo.PersonRenterInfo;
import com.household.util.C3P0Utils;

public class PersonRenterInfoDaoImpl implements PersonRenterInfoDao {
	QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override//租户信息增加（输入PersonRenterInfo类，返回布尔类型）
	public int addPersonRenterInfo(PersonRenterInfo pe) {
		String sql = "INSERT INTO person_renter_info VALUE(NULL,?,?,?)";
		try {
			return qr.update(sql, pe.getOwnerId(),pe.getTimeStart(),pe.getTimeEnd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//租户信息删除（输入ID，返回布尔类型）
	public int delPersonRenterInfo(int id) {
		String sql = "DELETE FROM person_renter_info WHERE renter_id = ?";
		try {
			return qr.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//租户信息修改（输入PersonRenterInfo类，返回布尔类型）
	public int updatePersonRenterInfo(PersonRenterInfo pe) {
		String sql = "UPDATE person_renter_info SET renter_id = ?,owner_id = ?,time_start = ?,time_end = ? WHERE renter_id = ?";
		try {
			return qr.update(sql, pe.getRenterId(),pe.getOwnerId(),pe.getTimeStart(),pe.getTimeEnd(),pe.getRenterId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//查询所有租户信息（无输入，返回List<PersonRenterInfo>)
	public List<PersonRenterInfo> getPersonRenterInfoAll() {
		String sql = "SELECT renter_id AS renterId,owner_id AS ownerId,time_start AS timeStart,time_end AS timeEnd FROM person_renter_info";
		try {
			return qr.query(sql, new BeanListHandler<PersonRenterInfo>(PersonRenterInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
