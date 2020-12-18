package com.household.service.impl;

import java.util.List;

import com.household.dao.StareInfoDao;
import com.household.dao.StareTypeDao;
import com.household.dao.impl.StareInfoDaoImpl;
import com.household.dao.impl.StareTypeDaoImpl;
import com.household.pojo.StareInfo;
import com.household.pojo.StareType;
import com.household.service.StareManagerService;

public class StareManagerServiceImpl implements StareManagerService {
	StareTypeDao std = new StareTypeDaoImpl();
	StareInfoDao sti = new StareInfoDaoImpl();
	
	@Override//对商铺类型进行查询（无输入，输出List<StareType>)
	public List<StareType> getStareTypeAll() {
		List<StareType> list = std.getStareTypeAll();
		return list;
	}

	@Override//对商铺类型进行添加（输入StareType对象，输出布尔类型）
	public boolean addStareType(StareType st) {
		int i = std.addStareType(st);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//对商铺类型进行删除（输入ID（int），返回布尔类型）
	public boolean delStareType(int id) {
		int i = std.delStareType(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//对商铺类型进行更改（输入StareType对象，返回布尔类型）
	public boolean updateStareType(StareType st) {
		int i = std.updateStareType(st);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//对商铺信息进行增加（输入StareInfo对象，返回布尔类型）
	public boolean addStareInfo(StareInfo si) {
		int i = sti.addStareInfo(si);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//对商铺信息进行删除（输入ID（int），舒服布尔类型）
	public boolean delStareInfo(int id) {
		int i = sti.delStareInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//对商铺信息进行修改（输入StareInfo对象，返回布尔类型）
	public boolean updateStareInfo(StareInfo si) {
		int i = sti.updateStareInfo(si);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//通过连表查询，查询已经租出去的商铺（无输入，返回List<StareInfo>）
	public List<StareInfo> getStareInfoByOut() {
		List<StareInfo> list = sti.getStareInfoByOut();
		return list;
	}
	
	
	
	

}
