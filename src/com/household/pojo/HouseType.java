package com.household.pojo;

public class HouseType {
    private Integer houseTypeId;

    private String houseTypeName;

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public String getHouseTypeName() {
        return houseTypeName;
    }

    public void setHouseTypeName(String houseTypeName) {
        this.houseTypeName = houseTypeName == null ? null : houseTypeName.trim();
    }

	public HouseType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HouseType(Integer houseTypeId, String houseTypeName) {
		super();
		this.houseTypeId = houseTypeId;
		this.houseTypeName = houseTypeName;
	}

	@Override
	public String toString() {
		return "HouseType [houseTypeId=" + houseTypeId + ", houseTypeName=" + houseTypeName + "]";
	}
    
}