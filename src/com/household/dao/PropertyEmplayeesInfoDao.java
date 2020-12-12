package com.household.dao;

import java.util.List;

import com.household.pojo.PropertyEmplayeesInfo;

public interface PropertyEmplayeesInfoDao {
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByEmplayeeId(int id);
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoByPositionId(int id);
	int addPropertyEmplayeesInfo(PropertyEmplayeesInfo c);
	int delPropertyEmplayeesInfo(PropertyEmplayeesInfo c);
	int updatePropertyEmplayeesInfo(PropertyEmplayeesInfo c);
	List<PropertyEmplayeesInfo> getPropertyEmplayeesInfoAll();
}
