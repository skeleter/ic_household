package com.household.service;

import java.util.List;

import com.household.pojo.StareInfo;
import com.household.pojo.StareType;

/**
 *对stare开头的表进行增删查改,实现对商铺的租赁管理
 *需要写的方法：
 * 1.对商铺类型进行查询（无输入，输出List<StareType>)
 * 2.对商铺类型进行添加（输入StareType对象，输出布尔类型）
 * 3.对商铺类型进行删除（输入ID（int），舒服布尔类型）
 * 4.对商铺类型进行更改（输入StareType对象，返回布尔类型）
 * 5.对商铺信息进行增加（输入StareInfo对象，返回布尔类型）
 * 6.对商铺信息进行删除（输入ID（int），舒服布尔类型）
 * 7.对商铺信息进行修改（输入StareInfo对象，返回布尔类型）
 * 8.通过连表查询，查询已经租出去的商铺（无输入，返回List<StareInfo>）
 * 9.通过连表查询，查询未租出去的商铺（无输入，返回List<StareInfo>）
 * 10.综合查询商铺详细信息，三个表连在一起查询（无输入，返回List<StareInfoAll>)
 * 11.通过模糊名字对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
 * 12.通过模糊店铺类型对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
 * 13.通过区间租金对商铺详细信息进行查询，三个表连在一起查询（输入float（Min），float（Max），返回List<StareInfoAll>)
 * 14.通过模糊位置对商铺详细信息进行查询，三个表连在一起查询（输入String，返回List<StareInfoAll>)
 ****在每个方法前写备注，明确方法用途 
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：彭杰
 * 姓名：12月18日111
 */
public interface StareManagerService {
	
	//对商铺类型进行查询（无输入，输出List<StareType>)
	List<StareType> getStareTypeAll();
	
	//对商铺类型进行添加（输入StareType对象，输出布尔类型）
	boolean addStareType(StareType st);
	
    //对商铺类型进行删除（输入ID（int），返回布尔类型）
	boolean delStareType(int id);
	
	//对商铺类型进行更改（输入StareType对象，返回布尔类型）
	boolean updateStareType(StareType st);
	
	//对商铺信息进行增加（输入StareInfo对象，返回布尔类型）
	boolean addStareInfo(StareInfo si);
	
	//对商铺信息进行删除（输入ID（int），舒服布尔类型）
	boolean delStareInfo(int id);
	
	//对商铺信息进行修改（输入StareInfo对象，返回布尔类型）
	boolean updateStareInfo(StareInfo si);
	
	//通过连表查询，查询已经租出去的商铺（无输入，返回List<StareInfo>）
	List<StareInfo> getStareInfoByOut();
	
	
	
	
	
	
	
	
	
	
	
	
	

}
