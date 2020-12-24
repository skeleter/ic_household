package com.household.dao;

import java.util.List;

import com.household.pojo.PersonOwnerInfo;

public interface PersonOwnerInfoDao {
	
	
	List<PersonOwnerInfo> getPersonOwnerInfoByOwnerId(int id);
	
	
	List<PersonOwnerInfo> getPersonOwnerInfoByResidentId(int id);
	
	//业主信息增加（输入PersonOwnerInfo类，返回布尔类型）
	int addPersonOwnerInfo(PersonOwnerInfo c);
	
	//业主信息删除（输入ID，返回布尔类型）
	int delPersonOwnerInfo(int id);
	
	//业主信息修改（输入PersonOwnerInfo类，返回布尔类型）
	int updatePersonOwnerInfo(PersonOwnerInfo c);
	
	//查询所有业主信息（无输入，返回List<PersonOwnerInfo>)
	List<PersonOwnerInfo> getPersonOwnerInfoAll();
}
