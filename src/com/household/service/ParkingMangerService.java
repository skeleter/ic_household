package com.household.service;
/**
 *对parking开头的表进行增删查改
 *需要写的方法：
 *1.对车位信息的增加（输入ParkingInfo，返回布尔类型）
 *2.对车位信息的删除（输入int，返回布尔类型）
 *3.对车位信息的修改（输入ParkingInfo，返回布尔类型）
 *4.对车位租赁信息的增加（输入ParkingRentInfo，返回布尔类型）
 *5.对车位租赁的信息删除（输入parking_id（int）,返回布尔类型）
 *6.对车位租赁信息的修改（输入ParkingRentInfo，返回布尔类型）
 *7.查询所有车位信息（无输入，返回List<ParkingInfo>)
 *8.查询所有车位租赁信息（无输入，返回List<ParkingRentInfo>)
 *9.查询未租或已租出去的车位信息（输入布尔类型，已租为true，未租为false，返回List<ParkingInfo>)
 *10.查询租金在一定区间内的车位（输入float，float，返回List<ParkingInfo>)
 *11.按照车牌查询车位信息（多表查询，ParkingInfo，ParkingRentInfo）（输入string，返回ParkingInfo）
 *12，查询剩余10天以内的车位信息（多表查询，ParkingInfo，ParkingRentInfo）（无输入，返回ParkingInfo）
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：
 * 姓名：
 */
interface ParkingMangerService {

}
