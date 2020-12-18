package com.household.dao;

import java.util.List;

import com.household.pojo.StareInfo;

public interface StareInfoDao {
	
	
	List<StareInfo> getStareInfoByStareId(int id);
	
	
	List<StareInfo> getStareInfoByStareTpyeId(int id);
	
	//对商铺信息进行增加（输入StareInfo对象，返回布尔类型）
	int addStareInfo(StareInfo c);
	
	//对商铺信息进行删除（输入ID（int），舒服布尔类型）
	int delStareInfo(int id);
	
	//对商铺信息进行修改（输入StareInfo对象，返回布尔类型）
	int updateStareInfo(StareInfo c);
	
	//通过连表查询，查询已经租出去的商铺（无输入，返回List<StareInfo>）
	List<StareInfo> getStareInfoByOut();
	
	
	List<StareInfo> getStareInfoAll();
}
