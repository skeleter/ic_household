package com.household.pojo;

public class PropertyEmpalyeesPositon {
    private Integer positionId;

    private String positionName;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

	public PropertyEmpalyeesPositon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyEmpalyeesPositon(Integer positionId, String positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "PropertyEmpalyeesPositon [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
    
}