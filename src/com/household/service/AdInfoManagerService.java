package com.household.service;

import java.util.List;

import com.household.pojo.AdInfo;
import com.household.pojo.AdType;

/**
 *实现对广告位信息的管理，操作Ad开头的表，进行增删改
 *需要写的方法：
 *广告类型
 *1.增加广告位的类型（输入String，返回布尔类型）
 *2.修改广告位的类型（输入AdType对象，返回布尔类型）
 *3.删除广告位的类型（输入ID（int），返回布尔类型）
 *4.查询所有广告位类型（无输入，返回LIst<Adtype>）
 *广告详情：
 *5.增加广告位，包含广告位的ID，类型，位置，租金（输入AdInfo对象，返回布尔类型）
 *6.修改广告位的信息（输入AdInfo对象，返回布尔类型)
 *7.通过ID删除相应的广告位（输入广告位ID（int），返回布尔类型）
 *8.通过ID查询相应的广告位（输入广告位ID（int），返回AdInfo对象）
 *9.模糊查询位置相应的广告位（输入String，返回LIst<AdInfo>）
 *10.模糊查询广告位类型相应的广告位（输入String，返回LIst<AdInfo>）
 *11.查询指定租金区间的广告位（输入两个float，返回返回LIst<AdInfo>）
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：12月12日
 * 姓名：彭杰
 */
public interface AdInfoManagerService {
	
	//增加广告位的类型
	boolean addAdType(String str);
	
	//修改广告位的类型
	boolean updateAdType(AdType at);
	
	//删除广告位的类型
	boolean delAdType(int id);
		
	//查询所有广告位类型
	List<AdType> getAdTypeAll();
	
	//增加广告详细信息，包含广告位的ID，类型，位置，租金
	boolean addAdInfo(AdInfo ad);
	
	//修改广告位的信息（输入AdInfo对象，返回布尔类型)
	boolean updateAdInfo(AdInfo ad);
	
	//通过ID删除相应的广告位（输入广告位ID（int），返回布尔类型）
	boolean delAdInfo(int id);
	
	//通过ID查询相应的广告位（输入广告位ID（int），返回AdInfo对象）
	AdInfo getAdInfoByAdId(int id);
	
	//模糊查询位置相应的广告位（输入String，返回LIst<AdInfo>）
	List<AdInfo> getAdInfoByLike(String str);
	
	//模糊查询广告位类型相应的广告位（输入String，返回LIst<AdInfo>）
	List<AdInfo> getAdInfoByLikeType(String str);
	
	//查询指定租金区间的广告位（输入两个float，返回返回LIst<AdInfo>）
	List<AdInfo> getAdInfoByBetween(Integer a, Integer b);
	
}

