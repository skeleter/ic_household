package com.household.service.impl;

import java.util.List;

import com.household.dao.PropertyEmpalyeesPositonDao;
import com.household.dao.PropertyEmplayeesInfoDao;
import com.household.dao.impl.PropertyEmpalyeesPositonDaoImp;
import com.household.dao.impl.PropertyEmplayeesInfoDaoImp;
import com.household.pojo.PropertyEmpalyeesPositon;
import com.household.pojo.PropertyEmplayeesInfo;
import com.household.service.EmployeeManangerSrevice;

public class EmployeeManangerSreviceImp implements EmployeeManangerSrevice{
private PropertyEmpalyeesPositonDao pepd = new PropertyEmpalyeesPositonDaoImp();
private PropertyEmplayeesInfoDao peid = new PropertyEmplayeesInfoDaoImp();	
	
	//1.对员工职务的增加（输入String，返回布尔类型）,成功返回true，失败返回false
	//此处有点问题，职位名没设置唯一，可以不断添加id不同，职位相同的数据
	@Override
	public boolean addEmplayeesPosition(String position) {	
		PropertyEmpalyeesPositon pep = new PropertyEmpalyeesPositon(null, position);
		int flag = pepd.addPropertyEmpalyeesPositon(pep);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	
	//2.对员工职务的修改（输入PropertyEmpalyeesPositon对象，返回布尔类型）,成功返回true，失败返回false
	//由于是对现有的信息修改，所以此对象应该由前端传进servlet时创建
	@Override
	public boolean updateEmplayeesPosition(PropertyEmpalyeesPositon pep) {
		int flag = pepd.updatePropertyEmpalyeesPositon(pep);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}	
	}


	//3.查询所有员工职务（无输入，返回List<PropertyEmpalyeesPositon>)
	@Override
	public List<PropertyEmpalyeesPositon> getAllEmplayeesPosition() {
		return pepd.getPropertyEmpalyeesPositonAll();
	}


	
	//4.对员工信息的增加（输入PropertyEmplayeesInfo对象，返回布尔类型）
	@Override
	public boolean addPropertyEmplayeesInfo(PropertyEmplayeesInfo pei) {
		int flag = peid.addPropertyEmplayeesInfo(pei);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	//5.对员工信息的删除（输入ID（int），返回布尔类型）
	@Override
	public boolean delPropertyEmplayeesInfo(int id) {
		int flag = peid.delPropertyEmplayeesInfoByEmplayeeId(id);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	//6.对员工信息的修改（输入PropertyEmplayeesInfo对象，返回布尔类型）
	@Override
	public boolean updatePropertyEmplayeesInfo(PropertyEmplayeesInfo pei) {
		int flag = peid.updatePropertyEmplayeesInfo(pei);
		if (flag != 0) {
			return true;
		} else {
			return false;
		}
	}

	//7.模糊查询某个名字的员工（输入String，返回List<PropertyEmplayeesInfo>)
	@Override
	public List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByName(String name) {
		List<PropertyEmplayeesInfo> list = peid.fuzzyQueryEmplayeesByName(name);
		return list;
	}

	//8.模糊查询某个职务的员工（输入Sting，返回List<PropertyEmplayeesInfo>)
	@Override
	public List<PropertyEmplayeesInfo> fuzzyQueryEmplayeesByPosition(String position) {
		List<PropertyEmplayeesInfo> list = peid.fuzzyQueryEmplayeesByPosition(position);
		return list;
	}

	
	
	
}
