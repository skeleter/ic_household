package com.household.pojo;

import java.util.Date;

public class AmmeterRechargeData {
    private Integer ownerId;

    private Integer ammeterId;

    private Date rechargeTime;

    private Float rechargeNum;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getAmmeterId() {
        return ammeterId;
    }

    public void setAmmeterId(Integer ammeterId) {
        this.ammeterId = ammeterId;
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

	public AmmeterRechargeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AmmeterRechargeData(Integer ownerId, Integer ammeterId, Date rechargeTime, Float rechargeNum) {
		super();
		this.ownerId = ownerId;
		this.ammeterId = ammeterId;
		this.rechargeTime = rechargeTime;
		this.rechargeNum = rechargeNum;
	}

	@Override
	public String toString() {
		return "AmmeterRechargeData [ownerId=" + ownerId + ", ammeterId=" + ammeterId + ", rechargeTime=" + rechargeTime
				+ ", rechargeNum=" + rechargeNum + "]";
	}
    
}