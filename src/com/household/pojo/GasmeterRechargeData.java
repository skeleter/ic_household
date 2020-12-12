package com.household.pojo;

import java.util.Date;

public class GasmeterRechargeData {
    private Integer ownerId;

    private Integer gasmeterId;

    private Date rechargeTime;

    private Float rechargeNum;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getGasmeterId() {
        return gasmeterId;
    }

    public void setGasmeterId(Integer gasmeterId) {
        this.gasmeterId = gasmeterId;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Float getRechargeNum() {
        return rechargeNum;
    }

    public void setRechargeNum(Float rechargeNum) {
        this.rechargeNum = rechargeNum;
    }

	public GasmeterRechargeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GasmeterRechargeData(Integer ownerId, Integer gasmeterId, Date rechargeTime, Float rechargeNum) {
		super();
		this.ownerId = ownerId;
		this.gasmeterId = gasmeterId;
		this.rechargeTime = rechargeTime;
		this.rechargeNum = rechargeNum;
	}

	@Override
	public String toString() {
		return "GasmeterRechargeData [ownerId=" + ownerId + ", gasmeterId=" + gasmeterId + ", rechargeTime="
				+ rechargeTime + ", rechargeNum=" + rechargeNum + "]";
	}
    
}