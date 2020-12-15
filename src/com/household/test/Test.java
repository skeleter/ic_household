package com.household.test;

import java.util.List;

import com.household.dao.AccountInfoDao;
import com.household.dao.impl.AccountInfoDaoImp;
import com.household.pojo.AccountInfo;
import com.household.service.RegisterAndLoginService;
import com.household.service.impl.RegisterAndLoginServiceImp;

public class Test {
@org.junit.Test
public void test(){
	AccountInfoDao a = new AccountInfoDaoImp();
	
	System.out.println(a.getAccountInfoAll());
	
}

@org.junit.Test
public void test1(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.isUserExist("dd"));
	System.out.println(a.isUserExist("aa"));
}	
@org.junit.Test
public void test2(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.isUnameAndPassWordRight(new AccountInfo(1,"dd","23244","dddddd")));
	System.out.println(a.isUnameAndPassWordRight(new AccountInfo(1,"dd","2324","dddddd")));
}	
	
@org.junit.Test
public void test3(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.AddUser(new AccountInfo(1,"dd","23244","dddddd")));
	System.out.println(a.AddUser(new AccountInfo(6,"dd","23244","dddddd")));
}

@org.junit.Test
public void test4(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.deleteById(1));
	System.out.println(a.deleteById(8));
}

@org.junit.Test
public void test5(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.updateUser(new AccountInfo(2,"a","a","a")));
	System.out.println(a.updateUser(new AccountInfo(9,"a","a","a")));
}
	
	
@org.junit.Test
public void test6(){
	RegisterAndLoginService a = new RegisterAndLoginServiceImp();
	System.out.println(a.queryUserByName("a"));
	System.out.println(a.queryUserByName("accc"));
}
	



}
