package com.household.dao;

import java.util.List;

import com.household.pojo.PersonRenterInfoAll;

public interface PersonRenterInfoAllDao {
	
	//查询所有租房信息，连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(无输入，返回List<PersonRenterInfoAll>类）
	List<PersonRenterInfoAll> getPersonRenterInfoAll();
	
	//通过租户ID查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入int，PersonRenterInfoAll类）
	PersonRenterInfoAll getPersonRenterInfoAllById(int id);
	
	//通过租户电话查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入String，PersonRenterInfoAll类）
	PersonRenterInfoAll getPersonRenterInfoAllByPhone(String number);

}
