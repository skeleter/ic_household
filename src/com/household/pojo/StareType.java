package com.household.pojo;

public class StareType {
    private Integer stareTypeId;

    private String stareTypeName;

    public Integer getStareTypeId() {
        return stareTypeId;
    }

    public void setStareTypeId(Integer stareTypeId) {
        this.stareTypeId = stareTypeId;
    }

    public String getStareTypeName() {
        return stareTypeName;
    }

    public void setStareTypeName(String stareTypeName) {
        this.stareTypeName = stareTypeName == null ? null : stareTypeName.trim();
    }

	public StareType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StareType(Integer stareTypeId, String stareTypeName) {
		super();
		this.stareTypeId = stareTypeId;
		this.stareTypeName = stareTypeName;
	}

	@Override
	public String toString() {
		return "StareType [stareTypeId=" + stareTypeId + ", stareTypeName=" + stareTypeName + "]";
	}
    
}