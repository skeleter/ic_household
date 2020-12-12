package com.household.pojo;

public class WatermeterInfo {
    private Integer watermeterId;

    private Float watermeterSurplus;

    private Integer houseId;

    public Integer getWatermeterId() {
        return watermeterId;
    }

    public void setWatermeterId(Integer watermeterId) {
        this.watermeterId = watermeterId;
    }

    public Float getWatermeterSurplus() {
        return watermeterSurplus;
    }

    public void setWatermeterSurplus(Float watermeterSurplus) {
        this.watermeterSurplus = watermeterSurplus;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

	public WatermeterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WatermeterInfo(Integer watermeterId, Float watermeterSurplus, Integer houseId) {
		super();
		this.watermeterId = watermeterId;
		this.watermeterSurplus = watermeterSurplus;
		this.houseId = houseId;
	}

	@Override
	public String toString() {
		return "WatermeterInfo [watermeterId=" + watermeterId + ", watermeterSurplus=" + watermeterSurplus
				+ ", houseId=" + houseId + "]";
	}
    
}