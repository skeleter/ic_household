package com.household.test;

import java.util.List;

import org.junit.Test;
import com.household.pojo.AdInfo;
import com.household.pojo.AdType;
import com.household.pojo.EquipmentInfo;
import com.household.pojo.StareInfo;
import com.household.pojo.StareInfoAll;
import com.household.pojo.StareType;
import com.household.service.AdInfoManagerService;
import com.household.service.EquipmentManagerService;
import com.household.service.StareManagerService;
import com.household.service.impl.AdInfoManagerServiceImpl;
import com.household.service.impl.EquipmentManagerServiceImpl;
import com.household.service.impl.StareManagerServiceImpl;

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
	
	
	
	
	
	
	
}
