package com.household.dao;

import java.util.List;

import com.household.pojo.PersonRenterInfo;

public interface PersonRenterInfoDao {
	
	//租户信息增加（输入PersonRenterInfo类，返回布尔类型）
	int addPersonRenterInfo(PersonRenterInfo pe);
	
	//租户信息删除（输入ID，返回布尔类型）
	int delPersonRenterInfo(int id);
	
	//租户信息修改（输入PersonRenterInfo类，返回布尔类型）
	int updatePersonRenterInfo(PersonRenterInfo pe);
	
	//查询所有租户信息（无输入，返回List<PersonRenterInfo>)
	List<PersonRenterInfo> getPersonRenterInfoAll();

}
