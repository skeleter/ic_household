package com.household.dao;

import java.util.List;
import java.util.Map;

import com.household.pojo.AccountInfo;

public interface AccountInfoDao {
	AccountInfo getAccountInfoByUserName(String name);
	AccountInfo getAccountInfoByUserNameAndPassWord(String name,String password);
	public AccountInfo getAccountInfoByUserNameToType(String name);
	int addAccountInfo(AccountInfo c);
	int delAccountInfoById(int id);
	int updateAccountInfo(AccountInfo c);
	List<Map<String, Object>> getAccountInfoAll();
}
