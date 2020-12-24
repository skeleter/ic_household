package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PersonOwnerInfoDao;
import com.household.pojo.PersonOwnerInfo;
import com.household.util.C3P0Utils;

public class PersonOwnerInfoDaoImpl implements PersonOwnerInfoDao {
	
	QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

	@Override
	public List<PersonOwnerInfo> getPersonOwnerInfoByOwnerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonOwnerInfo> getPersonOwnerInfoByResidentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//业主信息增加（输入PersonOwnerInfo类，返回布尔类型）
	public int addPersonOwnerInfo(PersonOwnerInfo c) {
		String sql = "INSERT INTO person_owner_info VALUE(NULL,?,?,?,?,?)";
		try {
			return qr.update(sql, c.getResidentId(),c.getOwnerName(),c.getOwnerSex(),c.getOwnerTelephone(),c.getOwnerType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//业主信息删除（输入ID，返回布尔类型）
	public int delPersonOwnerInfo(int id) {
		String sql = "DELETE FROM person_owner_info WHERE owner_id = ?";
		try {
			return qr.update(sql,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//业主信息修改（输入PersonOwnerInfo类，返回布尔类型）
	public int updatePersonOwnerInfo(PersonOwnerInfo c) {
		String sql = "UPDATE person_owner_info SET owner_id = ?,resident_id = ?,owner_name = ?,owner_sex = ?,owner_telephone = ?,owner_type = ? WHERE owner_id = ?";
		try {
			return qr.update(sql,c.getOwnerId(),c.getResidentId(),c.getOwnerName(),c.getOwnerSex(),c.getOwnerTelephone(),c.getOwnerType(),c.getOwnerId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override//查询所有业主信息（无输入，返回List<PersonOwnerInfo>)
	public List<PersonOwnerInfo> getPersonOwnerInfoAll() {
		String sql = "SELECT owner_id AS ownerId,resident_id AS residentId,owner_name AS ownerName,owner_sex AS ownerSex,owner_telephone AS ownerTelephone,owner_type AS ownerType FROM person_owner_info";
		try {
			return qr.query(sql, new BeanListHandler<PersonOwnerInfo>(PersonOwnerInfo.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
