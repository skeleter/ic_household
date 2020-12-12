package com.household.pojo;

public class AmmeterInfo {
    private Integer ammeterId;

    private Float ammeterSurplus;

    private Integer houseId;

    public Integer getAmmeterId() {
        return ammeterId;
    }

    public void setAmmeterId(Integer ammeterId) {
        this.ammeterId = ammeterId;
    }

    public Float getAmmeterSurplus() {
        return ammeterSurplus;
    }

    public void setAmmeterSurplus(Float ammeterSurplus) {
        this.ammeterSurplus = ammeterSurplus;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

	public AmmeterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AmmeterInfo(Integer ammeterId, Float ammeterSurplus, Integer houseId) {
		super();
		this.ammeterId = ammeterId;
		this.ammeterSurplus = ammeterSurplus;
		this.houseId = houseId;
	}

	@Override
	public String toString() {
		return "AmmeterInfo [ammeterId=" + ammeterId + ", ammeterSurplus=" + ammeterSurplus + ", houseId=" + houseId
				+ "]";
	}
    
}