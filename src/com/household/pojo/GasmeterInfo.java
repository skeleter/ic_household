package com.household.pojo;

public class GasmeterInfo {
    private Integer gasmeterId;

    private Float gasmeterSurplus;

    private Integer houseId;

    public Integer getGasmeterId() {
        return gasmeterId;
    }

    public void setGasmeterId(Integer gasmeterId) {
        this.gasmeterId = gasmeterId;
    }

    public Float getGasmeterSurplus() {
        return gasmeterSurplus;
    }

    public void setGasmeterSurplus(Float gasmeterSurplus) {
        this.gasmeterSurplus = gasmeterSurplus;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

	public GasmeterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GasmeterInfo(Integer gasmeterId, Float gasmeterSurplus, Integer houseId) {
		super();
		this.gasmeterId = gasmeterId;
		this.gasmeterSurplus = gasmeterSurplus;
		this.houseId = houseId;
	}

	@Override
	public String toString() {
		return "GasmeterInfo [gasmeterId=" + gasmeterId + ", gasmeterSurplus=" + gasmeterSurplus + ", houseId="
				+ houseId + "]";
	}
    
}