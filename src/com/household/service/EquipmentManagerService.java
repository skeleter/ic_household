package com.household.service;

import java.util.List;

import com.household.pojo.EquipmentInfo;

/**
 * 通过对equipment_info进行增删查改，实现对设备的管理
 * 需要实现的方法：
 * 1.增加设备数据（输入equipmentInfo对象，返回布尔类型）
 * 2.修改设备数据（输入equipmentInfo对象，返回布尔类型）
 * 3.通过设备ID删除设备数据（输入ID（int），返回布尔类型）
 * 4.查询相应ID的设备（输入ID（int））
 * 5.模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
 * 6.模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：彭杰
 * 姓名：12月13日
 */
public interface EquipmentManagerService {
	
	//增加设备数据（输入equipmentInfo对象，返回布尔类型）
	boolean addEquipmentInfo(EquipmentInfo c);
	
	//修改设备数据（输入equipmentInfo对象，返回布尔类型）
	boolean updateEquipmentInfo(EquipmentInfo c);
	
	//通过设备ID删除设备数据（输入ID（int），返回布尔类型）
	boolean delEquipmentInfo(int id);
	
	//查询相应ID的设备（输入ID（int），返回布尔类型）
	EquipmentInfo getEquipmentInfoByEquipmentId(int id);
	
	//模糊查询设备名字相应的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeName(String name);
	
	//模糊查询设备用途的设备数据（输入String，返回Lint<equipmentInfo>)
	List<EquipmentInfo> getEquipmentInfoLikeUse(String use);
	
}
