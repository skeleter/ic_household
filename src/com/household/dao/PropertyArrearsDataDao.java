package com.household.dao;

import java.util.Date;
import java.util.List;

import com.household.pojo.PropertyArrearsData;

public interface PropertyArrearsDataDao {
	
	//按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
	List<PropertyArrearsData> getPropertyArrearsDataByHouseId(int id);
	
	//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
	List<PropertyArrearsData> getPropertyArrearsDataByResidentId(int id);
	
	//物业费欠费记录增加（输入PropertyArrearsData对象，返回布尔类型）
	int addPropertyArrearsData(PropertyArrearsData c);
	
	//物业费欠费记录删除（输入ID(int),返回布尔类型）
	int delPropertyArrearsData(int id);
	
	//物业欠费记录修改（输入PropertyArrearsData对象，返回布尔类型）
	int updatePropertyArrearsData(PropertyArrearsData c);
	
	//查询所有
	List<PropertyArrearsData> getPropertyArrearsDataAll();
	
	//通过欠费时间段查询欠费记录（输入date，date，返回List<PropertyArrearsData>)
	List<PropertyArrearsData> getPropertyArrearsDataByTime(Date time1, Date time2);
}
