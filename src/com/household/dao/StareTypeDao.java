package com.household.dao;

import java.util.List;

import com.household.pojo.StareType;

public interface StareTypeDao {
	
	List<StareType> getStareTypeByStareTypeId(int id);
	
	//对商铺类型进行添加（输入StareType对象，输出布尔类型）
	int addStareType(StareType c);
	
	//对商铺类型进行删除（输入ID（int），返回布尔类型）
	int delStareType(int id);
	
	//对商铺类型进行更改（输入StareType对象，返回布尔类型）
	int updateStareType(StareType c);
	
	//对商铺类型进行查询（无输入，输出List<StareType>)
	List<StareType> getStareTypeAll();
}
