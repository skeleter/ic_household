package com.household.service.impl;

import org.junit.Test;

import com.household.dao.AccountInfoDao;
import com.household.dao.impl.AccountInfoDaoImp;
import com.household.pojo.AccountInfo;
import com.household.service.RegisterAndLoginService;

public class RegisterAndLoginServiceImp implements RegisterAndLoginService{
private AccountInfoDao aii= new AccountInfoDaoImp();
	


@Override
// 1.查询账户是否存在（输入String，返回布尔类型）
	public boolean isUserExist(String uname) {
		AccountInfo flag = aii.getAccountInfoByUserName(uname);
		if (flag != null) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	//2.查询账户密码是否错误（输入accountInfo对象，返回布尔类型）
	public boolean isUnameAndPassWordRight(AccountInfo ai) {
		AccountInfo flag = aii.getAccountInfoByUserNameAndPassWord(ai.getUserName(), ai.getUserPassword());
		if (flag != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	//3.增加账户数据（输入accountInfo对象，返回布尔类型）
	public boolean AddUser(AccountInfo ai) {
		int nuber = aii.addAccountInfo(ai);
		if (nuber != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	//4.删除账户数据（输入ID（int），返回布尔类型）
	public boolean deleteById(int id) {
		int nuber = aii.delAccountInfoById(id);
		if (nuber != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	//5.修改账户信息（输入accountInfo对象，返回布尔类型)
	public boolean updateUser(AccountInfo ai) {
		int nuber = aii.updateAccountInfo(ai);
		if (nuber != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	//6.查询指定用户名的用户类型（输入String，返回String）
	public String queryUserByName(String name) {
		AccountInfo type = aii.getAccountInfoByUserNameToType(name);
		if (type != null) {
			return type.getUserType();
		} else {
			return null;
		}
	}
	@Test
	public void test(){
		AccountInfo a=new AccountInfo(1,"10086","123456","xxx");
		System.out.println(a.getUserName()+a.getUserPassword());
		boolean b=isUnameAndPassWordRight(a);
		System.out.println(b);
	}

}
