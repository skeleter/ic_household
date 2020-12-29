package com.household.service.impl;

import java.util.List;

import org.junit.Test;

import com.household.dao.HouseInfoDao;
import com.household.dao.HouseTypeDao;
import com.household.dao.SelectCommentDao;
import com.household.dao.impl.HouseInfoDaoImp;
import com.household.dao.impl.HouseTypeDaoImp;
import com.household.dao.impl.SelectCommentDaoImpl;
import com.household.pojo.HouseInfo;
import com.household.pojo.HouseInfoAll;
import com.household.pojo.HouseType;
import com.household.service.HouseInfoMangerService;

public class HouseInfoMangerServiceImp implements HouseInfoMangerService {
	HouseTypeDao htd = new HouseTypeDaoImp();
	HouseInfoDao hid = new HouseInfoDaoImp();
	SelectCommentDao scd=new SelectCommentDaoImpl();
	/**
	 * 1.房屋类型的增加（输入HouseType，返回布尔类型）
	 */
	@Override
	public boolean addHouseType(HouseType ht) {
		int flag = htd.addHouseType(ht);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 2.对房屋类型的删除（输入ID（int），返回布尔类型）
	 */
	@Override
	public boolean delHouseTypeById(int htid) {
		int flag = htd.delHouseTypeById(htid);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 3.对房屋类型的修改（输入HouseType，返回布尔类型）
	 */
	@Override
	public boolean updateHouseType(HouseType ht) {
		int flag = htd.updateHouseType(ht);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 4.对所有房屋类型的查询（无输入，返回List<HouseType>)
	 */
	@Override
	public List<HouseType> getAllHouseType() {
		return htd.getHouseTypeAll();

	}

	/**
	 * 5.对房屋信息的增加（输入HouseInfo，返回布尔类型）
	 */
	@Override
	public boolean addHouseInfo(HouseInfo hi) {
		int flag = hid.addHouseInfo(hi);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 6.对房屋信息的删除（输入ID（int），返回布尔类型）
	 */
	@Override
	public boolean delHouseInfoById(int hiid) {
		int flag = hid.delHouseInfoById(hiid);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 7.对房屋信息的修改（输入HouseInfo，返回布尔类型）
	 */
	@Override
	public boolean updateHouseInfo(HouseInfo hi) {
		int flag = hid.updateHouseInfo(hi);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 8.对所有房屋信息的查询（无输入，返回List<HouseInfo>)
	 */
	@Override
	public List<HouseInfo> getAllHouseInfo() {
		return hid.getAllHouseInfo();
	}

	/**
	 * 9.通过对楼号层高的查询（输入int，返回List<HouseInfo>)
	 */
	@Override
	public List<HouseInfo> getHouseInfoByFloor(int floor) {
		return hid.getHouseInfoByFloor(floor);

	}

	/**
	 * 10.对房屋类型进行模糊查询房屋信息（输入String，返回List<HouseInfo>)
	 */
	@Override
	public List<HouseInfo> getHouseInfoLikeHouseType(String type) {
		return hid.getHouseInfoLikeHouseType(type);
	}
	
	/**
	 * 11.对有无房主进行查询（输入布尔类型（有房主为真），返回List<HouseInfo>)
	 */
	@Override
	public List<HouseInfo> getHouseInfoByResident(boolean flag) {
		return hid.getHouseInfoByResident(flag);
	
	}

	@Override
	public List<HouseInfoAll> getAllHouseInfoAll() {
		// TODO Auto-generated method stub
		return scd.getAllHouseInfoAll();
	}

	@Override
	public boolean getHouseInfoIs(int i) {
		// TODO Auto-generated method stub
		List<HouseInfo> flag = scd.getHouseInfoIs(i);
		if (flag != null) {
			return true;
		} else {
			return false;
		}
	}
	
}
