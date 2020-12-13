package com.household.dao;

import java.util.List;

import com.household.pojo.AdInfo;

public interface AdInfoDao {
	//通过ID查询相应的广告位（输入广告位ID（int），返回AdInfo对象）
		AdInfo getAdInfoByAdId(int id);
		
		List<AdInfo> getAdInfoByAdTypeId(int id);
		//添加广告详情
		int addAdInfo(AdInfo c);
		//通过ID删除相应的广告位（输入广告位ID（int），返回布尔类型）
		int delAdInfo(int id);
		//修改广告位的信息（输入AdInfo对象，返回布尔类型)
		int updateAdInfo(AdInfo c);
		
		List<AdInfo> getAdInfoAll();
		
		//模糊查询位置相应的广告位（输入String，返回LIst<AdInfo>）
		List<AdInfo> getAdInfoByLike(String str);
		
		//模糊查询广告位类型相应的广告位（输入String，返回LIst<AdInfo>）
		List<AdInfo> getAdInfoByLikeTypeId(Object[] arr);
		
		//查询指定租金区间的广告位（输入两个float，返回返回LIst<AdInfo>）
		List<AdInfo> getAdInfoByBetween(Float a, Float b);
}