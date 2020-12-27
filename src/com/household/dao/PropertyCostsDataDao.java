package com.household.dao;

import java.util.Date;
import java.util.List;

import com.household.pojo.PropertyCostsData;

public interface PropertyCostsDataDao {
	
	//按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	List<PropertyCostsData> getPropertyCostsDataByHouseId(int id);
	
	//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	List<PropertyCostsData> getPropertyCostsDataByResidentId(int id);
	
	//物业费缴费记录增加（输入PropertyCostsData对象，返回布尔类型）
	int addPropertyCostsData(PropertyCostsData c);
	
	//物业费缴费记录删除（输入ID(int),返回布尔类型）
	int delPropertyCostsData(int id);
	
	//物业缴费记录修改（输入PropertyCostsData对象，返回布尔类型）
	int updatePropertyCostsData(PropertyCostsData c);
	
	//全部物业缴费记录查询（无输入，返回List<PropertyCostsData>)
	List<PropertyCostsData> getPropertyCostsDataAll();
	
	//按照一定时间区间查询缴费记录（输入date，date，返回List<PropertyCostsData>)
	List<PropertyCostsData> getPropertyCostsDataByTime(Date time1, Date time2);
	
}
