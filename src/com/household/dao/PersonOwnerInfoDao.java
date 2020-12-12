package com.household.dao;

import java.util.List;

import com.household.pojo.PersonOwnerInfo;

public interface PersonOwnerInfoDao {
	List<PersonOwnerInfo> getPersonOwnerInfoByOwnerId(int id);
	List<PersonOwnerInfo> getPersonOwnerInfoByResidentId(int id);
	int addPersonOwnerInfo(PersonOwnerInfo c);
	int delPersonOwnerInfo(PersonOwnerInfo c);
	int updatePersonOwnerInfo(PersonOwnerInfo c);
	List<PersonOwnerInfo> getPersonOwnerInfoAll();
}
