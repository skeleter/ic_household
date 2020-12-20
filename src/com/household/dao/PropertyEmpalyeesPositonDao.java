package com.household.dao;

import java.util.List;

import com.household.pojo.PropertyEmpalyeesPositon;

public interface PropertyEmpalyeesPositonDao {
	List<PropertyEmpalyeesPositon> getPropertyEmpalyeesPositonByPositionId(int id);
	int addPropertyEmpalyeesPositon(PropertyEmpalyeesPositon c);
	int delPropertyEmpalyeesPositonById(int id);
	int delPropertyEmpalyeesPositonByName(String name);
	int updatePropertyEmpalyeesPositon(PropertyEmpalyeesPositon c);
	List<PropertyEmpalyeesPositon> getPropertyEmpalyeesPositonAll();
}
