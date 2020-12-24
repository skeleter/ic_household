package com.household.dao;

import java.util.List;

import com.household.pojo.PersonResidentInfo;

public interface PersonResidentInfoDao {
	
	
	List<PersonResidentInfo> getPersonResidentInfoByResidentId(int id);
	
	
	List<PersonResidentInfo> getPersonResidentInfoByOwnerId(int id);
	
	//住户信息增加（输入PersonResidentInfo类，返回布尔类型）
	int addPersonResidentInfo(PersonResidentInfo c);
	
	//住户信息删除（输入ID，返回布尔类型）
	int delPersonResidentInfo(int id);
	
	//住户信息修改（输入PersonResidentInfo类，返回布尔类型）
	int updatePersonResidentInfo(PersonResidentInfo c);
	
	//查询所有住户信息（无输入，返回List<PersonResidentInfo>)
	List<PersonResidentInfo> getPersonResidentInfoAll();
}
