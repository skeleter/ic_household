package com.household.pojo;

public class OperationRecords {
    private Integer operationId;

    private String operationObject;

    private String operationBehavior;

    private String dataLast;

    private String dataNow;

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getOperationObject() {
        return operationObject;
    }

    public void setOperationObject(String operationObject) {
        this.operationObject = operationObject == null ? null : operationObject.trim();
    }

    public String getOperationBehavior() {
        return operationBehavior;
    }

    public void setOperationBehavior(String operationBehavior) {
        this.operationBehavior = operationBehavior == null ? null : operationBehavior.trim();
    }

    public String getDataLast() {
        return dataLast;
    }

    public void setDataLast(String dataLast) {
        this.dataLast = dataLast == null ? null : dataLast.trim();
    }

    public String getDataNow() {
        return dataNow;
    }

    public void setDataNow(String dataNow) {
        this.dataNow = dataNow == null ? null : dataNow.trim();
    }

	public OperationRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OperationRecords(Integer operationId, String operationObject, String operationBehavior, String dataLast,
			String dataNow) {
		super();
		this.operationId = operationId;
		this.operationObject = operationObject;
		this.operationBehavior = operationBehavior;
		this.dataLast = dataLast;
		this.dataNow = dataNow;
	}

	@Override
	public String toString() {
		return "OperationRecords [operationId=" + operationId + ", operationObject=" + operationObject
				+ ", operationBehavior=" + operationBehavior + ", dataLast=" + dataLast + ", dataNow=" + dataNow + "]";
	}
    
}