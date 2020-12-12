package com.household.dao;

import java.util.List;

import com.household.pojo.OperationRecords;

public interface OperationRecordsDao {
	List<OperationRecords> getOperationRecordsByOperationId(int id);
	int addOperationRecords(OperationRecords c);
	int delOperationRecords(OperationRecords c);
	int updateOperationRecords(OperationRecords c);
	List<OperationRecords> getOperationRecordsAll();
}
