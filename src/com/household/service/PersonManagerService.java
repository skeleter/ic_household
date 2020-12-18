package com.household.service;
/**
 *对person开头的表和HouseInfo表进行增删查改,实现对业主和住户的信息的增删查改
 *需要写的方法：
 * 1.住户信息增加（输入PersonResidentInfo类，返回布尔类型）
 * 2.住户信息删除（输入ID，返回布尔类型）
 * 3.住户信息修改（输入PersonResidentInfo类，返回布尔类型）
 * 4.业主信息增加（输入PersonOwnerInfo类，返回布尔类型）
 * 5.业主信息删除（输入ID，返回布尔类型）
 * 6.业主信息修改（输入PersonOwnerInfo类，返回布尔类型）
 * 7.租户信息增加（输入ParkingRentInfo类，返回布尔类型）
 * 8.租户信息删除（输入ID，返回布尔类型）
 * 9.租户信息修改（输入ParkingRentInfo类，返回布尔类型）
 * 10.查询所有住户信息（无输入，返回List<PersonResidentInfo>)
 * 11.查询所有业主信息（无输入，返回List<PersonOwnerInfo>)
 * 12.查询所有租户信息（无输入，返回List<ParkingRentInfo>)
 * 13.查询出租的房子的信息，多表查询（PersonOwnerInfo，HouseInfo）（无输入，返回HouseInfo信息）
 * 14.查询所有住户详细信息，连表查询（HouseInfo，PersonResidentInfo，PersonOwnerInfo)(无输入，返回PersonResidentInfoAll类）
 * 15.通过业主ID查询住户详细信息，连表查询（HouseInfo，PersonResidentInfo，PersonOwnerInfo)(输入int，返回PersonResidentInfoAll类）
 * 16.通过房屋楼号查询住户详细信息，连表查询（HouseInfo，PersonResidentInfo，PersonOwnerInfo)(输入int，返回PersonResidentInfoAll类）
 * 17.通过房屋楼号层高门牌住户详细信息，连表查询（HouseInfo，PersonResidentInfo，PersonOwnerInfo)(输入int，int，int，返回PersonResidentInfoAll类）
 * 18.通过业主的电话住户详细信息，连表查询（HouseInfo，PersonResidentInfo，PersonOwnerInfo)(输入String，返回PersonResidentInfoAll类）
 * 19.查询所有租房信息，连表查询（HouseInfo，PersonOwnerInfo，ParkingRentInfo）(无输入，返回List<PersonRenterInfoAll>类）
 * 20.通过租户ID查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，ParkingRentInfo）(输入int，返回List<PersonRenterInfoAll>类）
 * 21.通过租户电话查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，ParkingRentInfo）(输入String，返回List<PersonRenterInfoAll>类）
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：
 * 姓名：
 */
public interface PersonManagerService {

}
