package com.household.test;

import java.util.List;

import org.junit.Test;
import com.household.pojo.AdInfo;
import com.household.pojo.AdType;
import com.household.pojo.EquipmentInfo;
import com.household.service.AdInfoManagerService;
import com.household.service.EquipmentManagerService;
import com.household.service.impl.AdInfoManagerServiceImpl;
import com.household.service.impl.EquipmentManagerServiceImpl;

public class demo {
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
