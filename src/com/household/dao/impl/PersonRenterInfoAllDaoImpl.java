package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.household.dao.PersonRenterInfoAllDao;
import com.household.pojo.PersonRenterInfoAll;
import com.household.util.C3P0Utils;

public class PersonRenterInfoAllDaoImpl implements PersonRenterInfoAllDao {

	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
	
	//查询所有租房信息，连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(无输入，返回List<PersonRenterInfoAll>类）
	@Override
	public List<PersonRenterInfoAll> getPersonRenterInfoAll() {
		String sql = "SELECT house_info.resident_id AS residentId,building,"
				+ "FLOOR,room,person_owner_info.owner_id AS ownerId,"
				+ "person_owner_info.owner_name AS ownerName,"
				+ "person_owner_info.owner_sex AS ownerSex,"
				+ "person_owner_info.owner_telephone AS ownerTelephone,"
				+ "person_renter_info.time_start AS timeStart,"
				+ "person_renter_info.time_end AS timeEnd FROM house_info "
				+ "INNER JOIN person_owner_info ON house_info.resident_id = person_owner_info.resident_id "
				+ "INNER JOIN person_renter_info ON person_owner_info.owner_id = person_renter_info.owner_id";
		try {
			return qr.query(sql, new BeanListHandler<PersonRenterInfoAll>(PersonRenterInfoAll.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//通过租户ID查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入int，PersonRenterInfoAll类）
	@Override
	public PersonRenterInfoAll getPersonRenterInfoAllById(int id) {
		String sql = "SELECT house_info.resident_id AS residentId,building,"
				+ "FLOOR,room,person_owner_info.owner_id AS ownerId,"
				+ "person_owner_info.owner_name AS ownerName,"
				+ "person_owner_info.owner_sex AS ownerSex,"
				+ "person_owner_info.owner_telephone AS ownerTelephone,"
				+ "person_renter_info.time_start AS timeStart,"
				+ "person_renter_info.time_end AS timeEnd FROM house_info "
				+ "INNER JOIN person_owner_info ON house_info.resident_id = person_owner_info.resident_id "
				+ "INNER JOIN person_renter_info ON person_owner_info.owner_id = person_renter_info.owner_id"
				+ " WHERE person_renter_info.renter_id = ?";
		try {
			return qr.query(sql, new BeanHandler<PersonRenterInfoAll>(PersonRenterInfoAll.class),id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//通过租户电话查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入String，PersonRenterInfoAll类）
	@Override
	public PersonRenterInfoAll getPersonRenterInfoAllByPhone(String number) {
		String sql = "SELECT house_info.resident_id AS residentId,building,"
				+ "FLOOR,room,person_owner_info.owner_id AS ownerId,"
				+ "person_owner_info.owner_name AS ownerName,"
				+ "person_owner_info.owner_sex AS ownerSex,"
				+ "person_owner_info.owner_telephone AS ownerTelephone,"
				+ "person_renter_info.time_start AS timeStart,"
				+ "person_renter_info.time_end AS timeEnd FROM house_info "
				+ "INNER JOIN person_owner_info ON house_info.resident_id = person_owner_info.resident_id "
				+ "INNER JOIN person_renter_info ON person_owner_info.owner_id = person_renter_info.owner_id"
				+ " WHERE person_owner_info.owner_telephone = ?";
		try {
			return qr.query(sql, new BeanHandler<PersonRenterInfoAll>(PersonRenterInfoAll.class),number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
