package com.household.dao;

import java.util.List;

import com.household.pojo.AccountInfo;

public interface AccountInfoDao {
	List<AccountInfo> getAccountInfoByUserId(int id);
	int addAccountInfo(AccountInfo c);
	int delAccountInfo(AccountInfo c);
	int updateAccountInfo(AccountInfo c);
	List<AccountInfo> getAccountInfoAll();

}
