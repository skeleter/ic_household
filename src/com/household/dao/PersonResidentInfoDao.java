package com.household.dao;

import java.util.List;

import com.household.pojo.PersonResidentInfo;

public interface PersonResidentInfoDao {
	List<PersonResidentInfo> getPersonResidentInfoByResidentId(int id);
	List<PersonResidentInfo> getPersonResidentInfoByOwnerId(int id);
	int addPersonResidentInfo(PersonResidentInfo c);
	int delPersonResidentInfo(PersonResidentInfo c);
	int updatePersonResidentInfo(PersonResidentInfo c);
	List<PersonResidentInfo> getPersonResidentInfoAll();
}
