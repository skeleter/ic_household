package com.household.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.household.dao.PropertyArrearsDataDao;
import com.household.dao.PropertyCostsDataDao;
import com.household.dao.impl.PropertyArrearsDataDaoImpl;
import com.household.dao.impl.PropertyCostsDataDaoImpl;
import com.household.pojo.PropertyArrearsData;
import com.household.pojo.PropertyCostsData;
import com.household.service.PropertyCostsManagerService;

public class PropertyCostsManagerServiceImpl implements PropertyCostsManagerService {
	
	PropertyCostsDataDao pc = new PropertyCostsDataDaoImpl();
	PropertyArrearsDataDao pad = new PropertyArrearsDataDaoImpl();

	@Override//物业费缴费记录增加（输入PropertyCostsData对象，返回布尔类型）
	public boolean addPropertyCostsData(PropertyCostsData pcd) {
		int i = pc.addPropertyCostsData(pcd);
		if (i != 0) {
			return true;
		} else {
			return false;
		}	
	}

	@Override//物业费缴费记录删除（输入ID(int),返回布尔类型）
	public boolean delPropertyCostsData(int id) {
		int i = pc.delPropertyCostsData(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//物业缴费记录修改（输入PropertyCostsData对象，返回布尔类型）
	public boolean updatePropertyCostsData(PropertyCostsData pcd) {
		int i = pc.updatePropertyCostsData(pcd);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//全部物业缴费记录查询（无输入，返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataAll() {
		List<PropertyCostsData> list = pc.getPropertyCostsDataAll();
		
		return list;
	}

	@Override//按照一定时间区间查询缴费记录（输入date，date，返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByTime(String time1, String time2) {
		List<PropertyCostsData> list = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date aa = format.parse(time1);
			Date bb = format.parse(time2);
			list = pc.getPropertyCostsDataByTime(aa, bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByResidentId(int id) {
		List<PropertyCostsData> list = pc.getPropertyCostsDataByResidentId(id);
		return list;
	}

	@Override//按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyCostsData>)
	public List<PropertyCostsData> getPropertyCostsDataByHouseId(int id) {
		List<PropertyCostsData> list = pc.getPropertyCostsDataByHouseId(id);
		return list;
	}

	@Override//物业费欠费记录增加（输入PropertyArrearsData对象，返回布尔类型）
	public boolean addPropertyArrearsData(PropertyArrearsData pa) {
		int i = pad.addPropertyArrearsData(pa);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//物业费欠费记录删除（输入ID(int),返回布尔类型）
	public boolean delPropertyArrearsData(int id) {
		int i = pad.delPropertyArrearsData(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//物业欠费记录修改（输入PropertyArrearsData对象，返回布尔类型）
	public boolean updatePropertyArrearsData(PropertyArrearsData pa) {
		int i = pad.updatePropertyArrearsData(pa);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override//通过欠费时间段查询欠费记录（输入date，date，返回List<PropertyArrearsData>)
	public List<PropertyArrearsData> getPropertyArrearsDataByTime(String time1, String time2) {
		List<PropertyArrearsData> list = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date aa = format.parse(time1);
			Date bb = format.parse(time2);
			list = pad.getPropertyArrearsDataByTime(aa, bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override//按照住户ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
	public List<PropertyArrearsData> getPropertyArrearsDataByResidentId(int id) {
		List<PropertyArrearsData> list = pad.getPropertyArrearsDataByResidentId(id);
		return list;
	}

	@Override//按照房屋ID查询缴费记录（输入ID（int），返回List<PropertyArrearsData>)
	public List<PropertyArrearsData> getPropertyArrearsDataByHouseId(int id) {
		List<PropertyArrearsData> list = pad.getPropertyArrearsDataByHouseId(id);
		return list;
	}

	@Override//计算物业费欠费总计（无输入，返回float）
	public Float countPropertyArrearsData() {
		List<PropertyArrearsData> list = pad.getPropertyArrearsDataAll();
		float aa = 0;
		for (PropertyArrearsData pp : list) {
			aa+=pp.getPropertyArrears();
		}
		return aa;
	}

	@Override//按住户计算物业费欠费总计（输入ID（int），返回float）
	public Float countPropertyArrearsDataByresidentId(int id) {
		List<PropertyArrearsData> list = pad.getPropertyArrearsDataByResidentId(id);
		float aa = 0;
		for (PropertyArrearsData pp : list) {
			aa+=pp.getPropertyArrears();
		}
		return aa;
	}

}
