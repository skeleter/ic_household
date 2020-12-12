package com.household.dao;

import java.util.List;
import com.household.pojo.AdType;

public interface AdTypeDao {
	List<AdType> getAdTypeByAdTypeId(int id);
	int addAdType(AdType c);
	int delAdType(AdType c);
	int updateAdType(AdType c);
	List<AdType> getAdTypeAll();
}
