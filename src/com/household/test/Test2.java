package com.household.test;

import java.util.List;

import org.junit.Test;

import com.household.pojo.PropertyEmpalyeesPositon;
import com.household.pojo.PropertyEmplayeesInfo;
import com.household.service.EmployeeManangerSrevice;
import com.household.service.impl.EmployeeManangerSreviceImp;

public class Test2 {
	@Test
	public void Test1() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.addEmplayeesPosition("司机"));
	}
	
	@Test
	public void Test2() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.updateEmplayeesPosition(new PropertyEmpalyeesPositon(6,"dadad")));
	}
	
	@Test
	public void Test3() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		List<PropertyEmpalyeesPositon> bb = aa.getAllEmplayeesPosition();
		bb.forEach(System.out::println);
	}
	
	@Test
	public void Test4() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.addPropertyEmplayeesInfo(new PropertyEmplayeesInfo(6,6,"dad")));
		System.out.println(aa.addPropertyEmplayeesInfo(new PropertyEmplayeesInfo(1,1,"dad")));
	}
	
	
	@Test
	public void Test5() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.delPropertyEmplayeesInfo(1));
		System.out.println(aa.delPropertyEmplayeesInfo(10));
	}
	
	@Test
	public void Test6() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.updatePropertyEmplayeesInfo(new PropertyEmplayeesInfo(2,3,"dafsdfs")));
		System.out.println(aa.updatePropertyEmplayeesInfo(new PropertyEmplayeesInfo(9,9,"dafsdfs")));
	}
	
	
	@Test
	public void Test7() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.fuzzyQueryEmplayeesByName("d"));
	}
	
	
	@Test
	public void Test8() {
		EmployeeManangerSrevice aa = new EmployeeManangerSreviceImp();
		System.out.println(aa.fuzzyQueryEmplayeesByPosition("司"));
	}
	
	
	
	
	
	
	
	
	
	
}
