package com.household.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.household.dao.AdInfoDao;
import com.household.dao.AdTypeDao;
import com.household.dao.impl.AdInfoDaoImpl;
import com.household.dao.impl.AdTypeDaoImpl;
import com.household.pojo.AdInfo;
import com.household.pojo.AdType;
import com.household.service.AdInfoManagerService;
import com.mysql.fabric.xmlrpc.base.Array;

public class AdInfoManagerServiceImpl implements AdInfoManagerService {
	AdTypeDao atd = new AdTypeDaoImpl();
	AdInfoDao adi = new AdInfoDaoImpl();
	
	@Override//添加广告类型
	public boolean addAdType(String str) {
		int i = atd.addAdType(str);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//修改广告位的类型
	public boolean updateAdType(AdType at) {
		int i = atd.updateAdType(at);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//删除广告位的类型
	public boolean delAdType(int id) {
		int i = atd.delAdType(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//查询所有广告位类型
	public List<AdType> getAdTypeAll() {
		List<AdType> list = atd.getAdTypeAll();
		return list;
	}

	@Override//增加广告详细信息，包含广告位的ID，类型，位置，租金
	public boolean addAdInfo(AdInfo ad) {
		int i = adi.addAdInfo(ad);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//修改广告位的信息（输入AdInfo对象，返回布尔类型)
	public boolean updateAdInfo(AdInfo ad) {
		int i = adi.updateAdInfo(ad);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//通过ID删除相应的广告位（输入广告位ID（int），返回布尔类型）
	public boolean delAdInfo(int id) {
		int i = adi.delAdInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//通过ID查询相应的广告位（输入广告位ID（int），返回AdInfo对象）
	public AdInfo getAdInfoByAdId(int id) {
		AdInfo adInfo = adi.getAdInfoByAdId(id);
		return adInfo;
	}

	@Override//模糊查询位置相应的广告位（输入String，返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByLike(String str) {
		List<AdInfo> list = adi.getAdInfoByLike(str);
		return list;
	}

	@Override//模糊查询广告位类型相应的广告位（输入String，返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByLikeType(String str) {
		List<AdType> list = atd.getAdTypeLikeTypeName(str);
		Object[] arr = new Object[list.size()];
		int x = 0;
		for (AdType adType : list) {
			arr[x] = adType.getAdTypeId();
			x++;
		}
		List<AdInfo> list3 = adi.getAdInfoByLikeTypeId(arr);
		
		return list3;
	}

	@Override//查询指定租金区间的广告位（输入两个float，返回返回LIst<AdInfo>）
	public List<AdInfo> getAdInfoByBetween(Integer a, Integer b) {
		
		List<AdInfo> list = adi.getAdInfoByBetween(a.floatValue(), b.floatValue());
		
		return list;
	}

}
