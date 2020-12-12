package com.household.pojo;

import java.util.Date;

public class WatermeterRechargeData {
    private Integer ownerId;

    private Integer watermeterId;

    private Date rechargeTime;

    private Float rechargeNum;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getWatermeterId() {
        return watermeterId;
    }

    public void setWatermeterId(Integer watermeterId) {
        this.watermeterId = watermeterId;
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

	public WatermeterRechargeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WatermeterRechargeData(Integer ownerId, Integer watermeterId, Date rechargeTime, Float rechargeNum) {
		super();
		this.ownerId = ownerId;
		this.watermeterId = watermeterId;
		this.rechargeTime = rechargeTime;
		this.rechargeNum = rechargeNum;
	}

	@Override
	public String toString() {
		return "WatermeterRechargeData [ownerId=" + ownerId + ", watermeterId=" + watermeterId + ", rechargeTime="
				+ rechargeTime + ", rechargeNum=" + rechargeNum + "]";
	}
    
}