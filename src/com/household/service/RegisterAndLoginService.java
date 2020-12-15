package com.household.service;

import com.household.pojo.AccountInfo;

/**
 * 通过对account_info表的增删查改,实现对登录注册界面的功能，
 * 需要写的方法：
 * 1.查询账户是否存在（输入String，返回布尔类型）
 * 2.查询账户密码是否错误（输入accountInfo对象，返回布尔类型）
 * 3.增加账户数据（输入accountInfo对象，返回布尔类型）
 * 4.删除账户数据（输入ID（int），返回布尔类型）
 * 5.修改账户信息（输入accountInfo对象，返回布尔类型）
 * 6.查询指定用户名的用户类型（输入String，返回String）
 ****在每个方法前写备注，明确方法用途
 ****在实现类内写Test测试方法，确保每个方法能正常执行
 ****修改删除相应表的接口Dao内的方法，并在impl包内实现
 ****将查询方法写入公共查询接口Dao内，并在impl包内实现，切记不要修改和删除其内部方法，防止其他功能无法实现
 ****在每个方法前写备注，明确方法用途，写完备注时间和姓名
 * 时间：
 * 姓名：
 */
public interface RegisterAndLoginService {
	 // 1.查询账户是否存在（输入String，返回布尔类型）
		public boolean isUserExist(String uname);

		//2.查询账户密码是否错误（输入accountInfo对象，返回布尔类型）
		public boolean isUnameAndPassWordRight(AccountInfo ai);
		
		//3.增加账户数据（输入accountInfo对象，返回布尔类型）
		public boolean AddUser(AccountInfo ai);
		
		//4.删除账户数据（输入ID（int），返回布尔类型）
		public boolean deleteById(int id);
		
		//5.修改账户信息（输入accountInfo对象，返回布尔类型)
		public boolean updateUser(AccountInfo ai);
		
		//6.查询指定用户名的用户类型（输入String，返回String）
		public String  queryUserByName(String name); 
}
