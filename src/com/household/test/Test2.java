package com.household.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.household.pojo.AdInfo;
import com.household.pojo.AdType;
import com.household.pojo.EquipmentInfo;
import com.household.pojo.HouseInfo;
import com.household.pojo.PersonOwnerInfo;
import com.household.pojo.PersonRenterInfo;
import com.household.pojo.PersonRenterInfoAll;
import com.household.pojo.PersonResidentInfo;
import com.household.pojo.PropertyEmpalyeesPositon;
import com.household.pojo.PropertyEmplayeesInfo;
import com.household.pojo.StareInfo;
import com.household.pojo.StareInfoAll;
import com.household.pojo.StareType;
import com.household.service.AdInfoManagerService;
import com.household.service.EmployeeManangerSrevice;
import com.household.service.EquipmentManagerService;
import com.household.service.PersonManagerService;
import com.household.service.StareManagerService;
import com.household.service.impl.AdInfoManagerServiceImpl;
import com.household.service.impl.EmployeeManangerSreviceImp;
import com.household.service.impl.EquipmentManagerServiceImpl;
import com.household.service.impl.PersonManagerServiceImpl;
import com.household.service.impl.StareManagerServiceImpl;

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
	
	@Test
	public void test01(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		boolean falg = ad.addAdType("邓雨川");
		System.out.println(falg);
	}
	
	@Test
	public void test02(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		boolean falg = ad.updateAdType(new AdType(1,"邓雨川"));
		System.out.println(falg);
	}

	@Test
	public void test03(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		boolean falg = ad.delAdType(2);
		System.out.println(falg);
	}
	
	@Test
	public void test04(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		List<AdType> list = ad.getAdTypeAll();
		for (AdType adType : list) {
			System.out.println(adType);
		}
	}
	
	@Test
	public void test05(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		AdType type = new AdType(3,"彭帆");
		AdInfo adInfo = new AdInfo();
		adInfo.setAdTypeId(type.getAdTypeId());
		adInfo.setAdLocation("武汉");
		adInfo.setRent(Float.valueOf(1000));
		boolean flag = ad.addAdInfo(adInfo);
		System.out.println(flag);
	}
	
	@Test
	public void test06(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		AdType type = new AdType(3,"邓雨川");
		AdInfo adInfo = new AdInfo();
		adInfo.setAdId(1);
		adInfo.setAdTypeId(type.getAdTypeId());
		adInfo.setAdLocation("卓刀泉");
		adInfo.setRent(Float.valueOf(1000));
		boolean flag = ad.updateAdInfo(adInfo);
		System.out.println(flag);
	}
	
	@Test
	public void test07(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();	
		boolean flag = ad.delAdInfo(1);
		System.out.println(flag);
	}
	
	@Test
	public void test08(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();	
		AdInfo adInfoByAdId = ad.getAdInfoByAdId(2);
		System.out.println(adInfoByAdId);
	}
	
	@Test
	public void test09(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();	
		List<AdInfo> list = ad.getAdInfoByLike("卓");
		for (AdInfo adInfo : list) {
			System.out.println(adInfo);
		}
	}
	
	@Test
	public void test10(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();	
		List<AdInfo> list = ad.getAdInfoByLikeType("雨");
		for (AdInfo adInfo : list) {
			System.out.println(adInfo);
		}
	}
	
	@Test
	public void test11(){
		AdInfoManagerService ad = new AdInfoManagerServiceImpl();
		
		List<AdInfo> list = ad.getAdInfoByBetween(1500, 6000);
		for (AdInfo adInfo : list) {
			System.out.println(adInfo);
		}
	}
	
	@Test
	public void test12(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		EquipmentInfo eq = new EquipmentInfo();
		eq.setEquipmentLocation("武汉");
		eq.setEquipmentName("王紫轩");
		eq.setEquipmentUse("彭杰");
		boolean flag = eqm.addEquipmentInfo(eq);
		System.out.println(flag);
	}	
	
	@Test
	public void test13(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		EquipmentInfo eq = new EquipmentInfo();
		eq.setEquipmentId(1);
		eq.setEquipmentName("王紫轩");
		eq.setEquipmentLocation("武汉");
		eq.setEquipmentUse("邓雨川");
		boolean flag = eqm.updateEquipmentInfo(eq);
		System.out.println(flag);
	}
	
	@Test
	public void test14(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		boolean flag = eqm.delEquipmentInfo(1);
		System.out.println(flag);
	}
	
	@Test
	public void test15(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		EquipmentInfo eq = eqm.getEquipmentInfoByEquipmentId(2);
		System.out.println(eq);	
	}
	
	@Test
	public void test16(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		List<EquipmentInfo> list = eqm.getEquipmentInfoLikeUse("雨");
		for (EquipmentInfo equipmentInfo : list) {
			System.out.println(equipmentInfo);
		}
	}
	
	@Test
	public void test17(){
		EquipmentManagerService eqm = new EquipmentManagerServiceImpl();
		
		List<EquipmentInfo> list = eqm.getEquipmentInfoLikeName("王");
		for (EquipmentInfo equipmentInfo : list) {
			System.out.println(equipmentInfo);
		}
	}
	
	@Test
	public void test18(){
		StareManagerService sm = new StareManagerServiceImpl();
		List<StareType> list = sm.getStareTypeAll();
		for (StareType stareType : list) {
			System.out.println(stareType);
		}
	}
	
	@Test
	public void test19(){
		StareManagerService sm = new StareManagerServiceImpl();
		StareType st = new StareType();
		st.setStareTypeName("卤肉拌饭");
		boolean flag = sm.addStareType(st);
		System.out.println(flag);
	}
	
	@Test
	public void test20 (){
		StareManagerService sm = new StareManagerServiceImpl();
		
		boolean flag = sm.delStareType(6);
		System.out.println(flag);
	}
	
	@Test
	public void test21(){
		StareManagerService sm = new StareManagerServiceImpl();
		StareType st = new StareType();
		st.setStareTypeId(4);
		st.setStareTypeName("烤肉拌饭");
		boolean flag = sm.updateStareType(st);
		System.out.println(flag);
	}
	
	@Test
	public void test22(){
		StareManagerService sm = new StareManagerServiceImpl();
		StareInfo st = new StareInfo();
		st.setStareTpyeId(3);
		st.setStareLocation("武汉");
		st.setStareName("邓雨川变装女仆网吧");
		st.setRent(Float.valueOf(1000));
		
		boolean flag = sm.addStareInfo(st);
		System.out.println(flag);
	}
	
	@Test
	public void test23(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		boolean flag = sm.delStareInfo(3);
		System.out.println(flag);
	}
	
	@Test
	public void test24(){
		StareManagerService sm = new StareManagerServiceImpl();
		StareInfo st = new StareInfo();
		st.setStareId(2);
		st.setStareTpyeId(2);
		st.setStareLocation("武汉");
		st.setStareName("彭帆曳步舞歌舞厅");
		st.setRent(Float.valueOf(2000));
		
		boolean flag = sm.updateStareInfo(st);
		System.out.println(flag);
	}
	
	@Test
	public void test25(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfo> list = sm.getStareInfoByOut();
		for (StareInfo stareInfo : list) {
			System.out.println(stareInfo);
		}
	}
	
	@Test
	public void test26(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfo> list = sm.getStareInfoByNoOut();
		for (StareInfo stareInfo : list) {
			System.out.println(stareInfo);
		}
	}
	
	@Test
	public void test27(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfoAll> list = sm.getStareInfoAll();
		for (StareInfoAll ss : list) {
			System.out.println(ss);
		}
	}
	
	@Test
	public void test28(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfoAll> list = sm.getStareInfoAllByLikeName("紫轩");
		for (StareInfoAll ss : list) {
			System.out.println(ss);
		}
	}
	
	@Test
	public void test29(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfoAll> list = sm.getStareInfoAllByTypeName("蛋糕");
		for (StareInfoAll ss : list) {
			System.out.println(ss);
		}
	}
	
	@Test
	public void test30(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfoAll> list = sm.getStareInfoAllByBetween(2000, 3000);
		for (StareInfoAll ss : list) {
			System.out.println(ss);
		}
	}
	
	@Test
	public void test31(){
		StareManagerService sm = new StareManagerServiceImpl();
		
		List<StareInfoAll> list = sm.getStareInfoAllByLocation("卓刀泉");
		for (StareInfoAll ss : list) {
			System.out.println(ss);
		}
	}
	
	@Test
	public void test32(){
		PersonManagerService pm = new PersonManagerServiceImpl();
		PersonResidentInfo pr = new PersonResidentInfo();
		pr.setAmount(3);
		pr.setOwnerId(2);
		boolean flag = pm.addPersonResidentInfo(pr);
		System.out.println(flag);
	}
	
	@Test
	public void test33(){
		PersonManagerService pm = new PersonManagerServiceImpl();
		boolean flag = pm.delPersonResidentInfo(3);
		System.out.println(flag);
	}
	
	@Test
	public void test34(){
		PersonManagerService pm = new PersonManagerServiceImpl();
		PersonResidentInfo pr = new PersonResidentInfo();
		pr.setResidentId(1);
		pr.setAmount(3);
		pr.setOwnerId(2);
		boolean flag = pm.updatePersonResidentInfo(pr);
		System.out.println(flag);
	}
	
	@Test
	public void test35(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonOwnerInfo ps = new PersonOwnerInfo();
		ps.setResidentId(1);
		ps.setOwnerName("王紫轩");
		ps.setOwnerSex("男");
		ps.setOwnerTelephone("15527930013");
		ps.setOwnerType("二货");
		boolean flag = pm.addPersonOwnerInfo(ps);
		System.out.println(flag);
	}
	
	@Test
	public void test36(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		
		boolean flag = pm.delPersonOwnerInfo(3);
		System.out.println(flag);
	}
	
	@Test
	public void test37(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonOwnerInfo ps = new PersonOwnerInfo();
		ps.setOwnerId(1);
		ps.setResidentId(1);
		ps.setOwnerName("王紫轩");
		ps.setOwnerSex("男");
		ps.setOwnerTelephone("15527930013");
		ps.setOwnerType("二货");
		boolean flag = pm.updatePersonOwnerInfo(ps);
		System.out.println(flag);
	}
	
	@Test
	public void test38() throws ParseException{
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonRenterInfo ps = new PersonRenterInfo();
		ps.setOwnerId(1);
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
		ps.setTimeStart(formatter.parse("2019-03-05"));
		ps.setTimeEnd(formatter.parse("2019-03-05"));
		boolean flag = pm.addPersonRenterInfo(ps);
		System.out.println(flag);
	}
	
	@Test
	public void test39(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 

		boolean flag = pm.delPersonRenterInfo(3);
		System.out.println(flag);
	}
	
	@Test
	public void test40() throws ParseException{
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonRenterInfo ps = new PersonRenterInfo();
		ps.setRenterId(1);
		ps.setOwnerId(1);
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
		ps.setTimeStart(formatter.parse("2019-03-05"));
		ps.setTimeEnd(formatter.parse("2019-08-05"));
		boolean flag = pm.updatePersonRenterInfo(ps);
		System.out.println(flag);
	}
	
	@Test
	public void test41(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		List<PersonResidentInfo> list = pm.getPersonResidentInfo();
		for (PersonResidentInfo pr : list) {
			System.out.println(pr);
		}
	}
	
	@Test
	public void test42(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		List<PersonOwnerInfo> list = pm.getPersonOwnerInfo();
		for (PersonOwnerInfo pr : list) {
			System.out.println(pr);
		}
	}
	
	@Test
	public void test43(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		List<PersonRenterInfo> list = pm.getPersonRenterInfo();
		for (PersonRenterInfo pr : list) {
			System.out.println(pr);
		}
	}
	
	@Test
	public void test44(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		List<HouseInfo> list = pm.getHouseInfoBychuzu();
		for (HouseInfo pr : list) {
			System.out.println(pr);
		}
	}
	
	@Test
	public void test45(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		List<PersonRenterInfoAll> list = pm.getPersonRenterInfoAll();
		for (PersonRenterInfoAll personRenterInfoAll : list) {
			System.out.println(personRenterInfoAll);
		}
	}
	
	@Test
	public void test46(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonRenterInfoAll pr = pm.getPersonRenterInfoAllById(1);
		System.out.println(pr);
	}
	
	@Test
	public void test47(){
		PersonManagerService pm = new PersonManagerServiceImpl(); 
		PersonRenterInfoAll pr = pm.getPersonRenterInfoAllByPhone("15527930013");
		System.out.println(pr);
	}
	
	
	
	
	
	
	
	
	
}
