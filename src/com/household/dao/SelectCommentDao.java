package com.household.dao;

import java.util.List;

import com.household.pojo.EquipmentInfo;
import com.household.pojo.HouseInfo;
import com.household.pojo.HouseInfoAll;

public interface SelectCommentDao {
	
	/*
	 * EquipmentInfo
	 * */
	//查询相应ID的设备（输入ID（int））
	EquipmentInfo getEquipmentInfoByEquipmentId(int id);
	//模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeUse(String use);
	//模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeName(String name);
	//对所有房屋信息ALl的查询（无输入，返回List<HouseInfoAll>)
	List<HouseInfoAll> getAllHouseInfoAll() ;
	//对房屋信息是否存在查询（输入ID，返回List<HouseInfo>）
	List<HouseInfo> getHouseInfoIs(int i);
	//对所有房屋信息ALl的typr查询（输入String，返回List<HouseInfoAll>)
	List<HouseInfoAll> getAllHouseInfoAllByType(String type) ;
	//对所有房屋信息ALl的层高查询（输入int，返回List<HouseInfoAll>)
	List<HouseInfoAll> getAllHouseInfoAllByFloor(int floor);
	//对所有房屋信息All的住户与否查询（输入boolean，返回List<HouseInfoAll>)
	List<HouseInfoAll> getAllHouseInfoAllByResident(boolean resident);
}
