package com.household.service;
/**
 *对propertyCosts表进行操作，实现对物业费用的增删改查
 *需要写的方法：
 * 1.物业费缴费记录增加（输入PropertyCostsData对象，返回布尔类型）
 * 2.物业费缴费记录删除（输入ID(int),返回布尔类型）
 * 3.物业缴费记录修改（输入PropertyCostsData对象，返回布尔类型）
 * 4.全部物业缴费记录查询（无输入，返回List<PropertyCostsData>)
 * 5.按照一定时间区间查询缴费记录（输入date，date，返回List<PropertyCostsData>)
 * 6.按照住户ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
 * 7.按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
 * 8.物业费欠费记录增加（输入PropertyArrearsData对象，返回布尔类型）
 * 9.物业费欠费记录删除（输入ID(int),返回布尔类型）
 * 10.物业欠费记录修改（输入PropertyArrearsData对象，返回布尔类型）
 * 11.通过欠费时间段查询欠费记录（输入date，date，返回List<PropertyArrearsData>)
 * 12.按照住户ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
 * 13.按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
 * 14.计算物业费欠费总计（无输入，返回float）
 * 15.按住户计算物业费欠费总计（输入ID（int），返回float）
 ****在每个方法前写备注，明确方法用途 
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：
 * 姓名：
 */
public interface PropertyCostsManagerService {

}
