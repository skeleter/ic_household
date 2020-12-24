package com.household.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.household.dao.PersonResidentInfoAllDao;
import com.household.pojo.PersonResidentInfoAll;
import com.household.util.C3P0Utils;

public class PersonResidentInfoAllDaoImpl implements PersonResidentInfoAllDao {

	//创建  DBUtils 操作数据库的对象  (需要给定 数据源)
    QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
	

}
