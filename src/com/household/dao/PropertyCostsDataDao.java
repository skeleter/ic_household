package com.household.dao;

import java.util.List;

import com.household.pojo.PropertyCostsData;

public interface PropertyCostsDataDao {
	List<PropertyCostsData> getPropertyCostsDataByHouseId(int id);
	List<PropertyCostsData> getPropertyCostsDataByResidentId(int id);
	int addPropertyCostsData(PropertyCostsData c);
	int delPropertyCostsData(PropertyCostsData c);
	int updatePropertyCostsData(PropertyCostsData c);
	List<PropertyCostsData> getPropertyCostsDataAll();
}
