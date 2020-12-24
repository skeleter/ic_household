package com.household.service.impl;

import java.util.List;

import com.household.dao.HouseInfoDao;
import com.household.dao.PersonOwnerInfoDao;
import com.household.dao.PersonRenterInfoAllDao;
import com.household.dao.PersonRenterInfoDao;
import com.household.dao.PersonResidentInfoDao;
import com.household.dao.impl.HouseInfoDaoImpl;
import com.household.dao.impl.PersonOwnerInfoDaoImpl;
import com.household.dao.impl.PersonRenterInfoAllDaoImpl;
import com.household.dao.impl.PersonRenterInfoDaoImpl;
import com.household.dao.impl.PersonResidentInfoDaoImpl;
import com.household.pojo.HouseInfo;
import com.household.pojo.PersonOwnerInfo;
import com.household.pojo.PersonRenterInfo;
import com.household.pojo.PersonRenterInfoAll;
import com.household.pojo.PersonResidentInfo;
import com.household.service.PersonManagerService;

public class PersonManagerServiceImpl implements PersonManagerService {
	PersonResidentInfoDao ps = new PersonResidentInfoDaoImpl();
	PersonOwnerInfoDao po = new PersonOwnerInfoDaoImpl();
	PersonRenterInfoDao psr = new PersonRenterInfoDaoImpl();
	HouseInfoDao hi = new HouseInfoDaoImpl();
	PersonRenterInfoAllDao pra = new PersonRenterInfoAllDaoImpl();
	
	@Override//住户信息增加（输入PersonResidentInfo类，返回布尔类型）
	public boolean addPersonResidentInfo(PersonResidentInfo pr) {
		int i = ps.addPersonResidentInfo(pr);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//住户信息删除（输入ID，返回布尔类型）
	public boolean delPersonResidentInfo(int id) {
		int i = ps.delPersonResidentInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//住户信息修改（输入PersonResidentInfo类，返回布尔类型）
	public boolean updatePersonResidentInfo(PersonResidentInfo pr) {
		int i = ps.updatePersonResidentInfo(pr);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//业主信息增加（输入PersonOwnerInfo类，返回布尔类型）
	public boolean addPersonOwnerInfo(PersonOwnerInfo ps) {
		int i = po.addPersonOwnerInfo(ps);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//业主信息删除（输入ID，返回布尔类型）
	public boolean delPersonOwnerInfo(int id) {
		int i = po.delPersonOwnerInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//业主信息修改（输入PersonOwnerInfo类，返回布尔类型）
	public boolean updatePersonOwnerInfo(PersonOwnerInfo ps) {
		int i = po.updatePersonOwnerInfo(ps);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//租户信息增加（输入PersonRenterInfo类，返回布尔类型）
	public boolean addPersonRenterInfo(PersonRenterInfo pe) {
		int i = psr.addPersonRenterInfo(pe);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//租户信息删除（输入ID，返回布尔类型）
	public boolean delPersonRenterInfo(int id) {
		int i = psr.delPersonRenterInfo(id);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//租户信息修改（输入PersonRenterInfo类，返回布尔类型）
	public boolean updatePersonRenterInfo(PersonRenterInfo pe) {
		int i = psr.updatePersonRenterInfo(pe);
		if (i != 0) {
			return true;
		} else {
			return false;
		}
	}


	@Override//查询所有住户信息（无输入，返回List<PersonResidentInfo>)
	public List<PersonResidentInfo> getPersonResidentInfo() {
		List<PersonResidentInfo> list = ps.getPersonResidentInfoAll();
		return list;
	}


	@Override//查询所有业主信息（无输入，返回List<PersonOwnerInfo>)
	public List<PersonOwnerInfo> getPersonOwnerInfo() {
		List<PersonOwnerInfo> list = po.getPersonOwnerInfoAll();
		return list;
	}


	@Override//查询所有租户信息（无输入，返回List<PersonRenterInfo>)
	public List<PersonRenterInfo> getPersonRenterInfo() {
		List<PersonRenterInfo> list = psr.getPersonRenterInfoAll();
		return list;
	}


	@Override//查询出租的房子的信息，多表查询（PersonOwnerInfo，HouseInfo）（无输入，返回HouseInfo信息）
	public List<HouseInfo> getHouseInfoBychuzu() {
		List<HouseInfo> list = hi.getHouseInfoBychuzu();
		return list;
	}


	//查询所有租房信息，连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(无输入，返回List<PersonRenterInfoAll>类）
	@Override
	public List<PersonRenterInfoAll> getPersonRenterInfoAll() {
		List<PersonRenterInfoAll> list = pra.getPersonRenterInfoAll();
		return list;
	}

	//通过租户ID查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入int，PersonRenterInfoAll类）
	@Override
	public PersonRenterInfoAll getPersonRenterInfoAllById(int id) {
		PersonRenterInfoAll pr = pra.getPersonRenterInfoAllById(id);
		return pr;
	}

	//通过租户电话查询租房信息,连表查询（HouseInfo，PersonOwnerInfo，PersonRenterInfo）(输入String，PersonRenterInfoAll类）
	@Override
	public PersonRenterInfoAll getPersonRenterInfoAllByPhone(String number) {
		PersonRenterInfoAll pr = pra.getPersonRenterInfoAllByPhone(number);
		return pr;
	}


	
}
