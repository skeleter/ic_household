package com.household.dao;

import java.util.List;

import com.household.pojo.PropertyArrearsData;

public interface PropertyArrearsDataDao {
	List<PropertyArrearsData> getPropertyArrearsDataByHouseId(int id);
	List<PropertyArrearsData> getPropertyArrearsDataByResidentId(int id);
	int addPropertyArrearsData(PropertyArrearsData c);
	int delPropertyArrearsData(PropertyArrearsData c);
	int updatePropertyArrearsData(PropertyArrearsData c);
	List<PropertyArrearsData> getPropertyArrearsDataAll();
}
