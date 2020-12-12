package com.household.pojo;

public class PropertyEmplayeesInfo {
    private Integer emplayeeId;

    private Integer positionId;

    private String emplayeeName;

    public Integer getEmplayeeId() {
        return emplayeeId;
    }

    public void setEmplayeeId(Integer emplayeeId) {
        this.emplayeeId = emplayeeId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getEmplayeeName() {
        return emplayeeName;
    }

    public void setEmplayeeName(String emplayeeName) {
        this.emplayeeName = emplayeeName == null ? null : emplayeeName.trim();
    }

	public PropertyEmplayeesInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyEmplayeesInfo(Integer emplayeeId, Integer positionId, String emplayeeName) {
		super();
		this.emplayeeId = emplayeeId;
		this.positionId = positionId;
		this.emplayeeName = emplayeeName;
	}

	@Override
	public String toString() {
		return "PropertyEmplayeesInfo [emplayeeId=" + emplayeeId + ", positionId=" + positionId + ", emplayeeName="
				+ emplayeeName + "]";
	}
    
}