package com.household.dao;

import java.util.List;
import com.household.pojo.AdType;

public interface AdTypeDao {
	//添加广告类型
		int addAdType(String str);
		//通过id删除广告类型
		int delAdType(int id);
		//修改广告类型
		int updateAdType(AdType c);
		//查询所有广告类型
		List<AdType> getAdTypeAll();
		//通过广告类型查询id
		AdType getAdTypeByAdTypeName(String str);
		//通过id查询广告类型
		AdType getAdTypeByAdTypeId(int id);
		//通过广告类型模糊查询
		List<AdType> getAdTypeLikeTypeName(String str);
}
