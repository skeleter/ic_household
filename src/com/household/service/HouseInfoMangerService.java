package com.household.service;

import java.util.List;

import com.household.pojo.HouseInfo;
import com.household.pojo.HouseType;

/**
 *对house开头的表进行增删查改,实现对房屋信息的查询和修改
 *需要写的方法：
 *1.对房屋类型的增加（输入HouseType，返回布尔类型）
 *2.对房屋类型的删除（输入ID（int），返回布尔类型）
 *3.对房屋类型的修改（输入HouseType，返回布尔类型）
 *4.对所有房屋类型的查询（无输入，返回List<HouseType>)
 *5.对房屋信息的增加（输入HouseInfo，返回布尔类型）
 *6.对房屋信息的删除（输入ID（int），返回布尔类型）
 *7.对房屋信息的修改（输入HouseInfo，返回布尔类型）
 *8.对所有房屋信息的查询（无输入，返回List<HouseInfo>)
 *9.通过对楼号层高的查询（输入int，int，返回List<HouseInfo>)
 *10.对房屋类型进行模糊查询房屋信息（输入String，返回List<HouseInfo>)
 *11.对有无房主进行查询（输入布尔类型（有房主为真），返回List<HouseInfo>)
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：
 * 姓名：
 */
public interface HouseInfoMangerService {
		//1.房屋类型的增加（输入HouseType，返回布尔类型）
		boolean addHouseType(HouseType ht);
		//2.对房屋类型的删除（输入ID（int），返回布尔类型）
		boolean delHouseTypeById(int htid);
		 //3.对房屋类型的修改（输入HouseType，返回布尔类型）
		boolean updateHouseType(HouseType ht);
		 //4.对所有房屋类型的查询（无输入，返回List<HouseType>)
		List<HouseType> getAllHouseType();
		 //5.对房屋信息的增加（输入HouseInfo，返回布尔类型）
		boolean addHouseInfo(HouseInfo hi);
		 //6.对房屋信息的删除（输入ID（int），返回布尔类型）
		boolean delHouseInfoById(int hiid);
		 //7.对房屋信息的修改（输入HouseInfo，返回布尔类型）
		boolean updateHouseInfo(HouseInfo hi);
		 //8.对所有房屋信息的查询（无输入，返回List<HouseInfo>)
		List<HouseInfo> getAllHouseInfo();
		//9.通过对楼号层高的查询（输入int，int，返回List<HouseInfo>)
		List<HouseInfo> getHouseInfoByFloor(int floor);
		 //10.对房屋类型进行模糊查询房屋信息（输入String，返回List<HouseInfo>)
		List<HouseInfo> getHouseInfoLikeHouseType(String type);
		 //11.对有无房主进行查询（输入布尔类型（有房主为真），返回List<HouseInfo>)
		List<HouseInfo> getHouseInfoByResident(boolean flag);
}
