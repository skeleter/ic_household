package com.household.dao;

import java.util.List;

import com.household.pojo.PropertyEmplayeesInfo;

public interface PropertyEmplayeesInfoDao {
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByEmplayeeId(int id);
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByPositionId(int id);
	int addPropertyEmplayeesInfo(PropertyEmplayeesInfo c);
	int delPropertyEmplayeesInfoByEmplayeeId(int eid);
	int delPropertyEmplayeesInfoByPositionId(int pid);
	int delPropertyEmplayeesInfoByName(String name);
	int updatePropertyEmplayeesInfo(PropertyEmplayeesInfo c);
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoAll();
	List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByName(String name);
	List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByPosition(String position);
}
