package com.household.dao;

import java.util.List;

import com.household.pojo.StareInfo;
import com.household.pojo.StareInfoAll;

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
	
	//通过连表查询，查询未租出去的商铺（无输入，返回List<StareInfo>）
	List<StareInfo> getStareInfoByNoOut();
	
	//综合查询商铺详细信息，三个表连在一起查询（无输入，返回List<StareInfoAll>)	
	List<StareInfoAll> getStareInfoAll();
	
	//通过模糊名字对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	List<StareInfoAll> getStareInfoAllByLikeName(String name);
	
	//通过模糊店铺类型对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	List<StareInfoAll> getStareInfoAllByTypeName(String typeName);
	
	//通过区间租金对商铺详细信息进行查询，三个表连在一起查询（输入float（Min），float（Max），返回List<StareInfoAll>)
	List<StareInfoAll> getStareInfoAllByBetween(Float min,Float max);
	
	//通过模糊位置对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
	List<StareInfoAll> getStareInfoAllByLocation(String location);
	
}
