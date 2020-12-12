package com.household.dao;

import java.util.List;

import com.household.pojo.StareType;

public interface StareTypeDao {
	List<StareType> getStareTypeByStareTypeId(int id);
	int addStareType(StareType c);
	int delStareType(StareType c);
	int updateStareType(StareType c);
	List<StareType> getStareTypeAll();
}
