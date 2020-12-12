package com.household.pojo;

import java.util.Date;

public class AmmeterUsedData {
    private Integer ammenterId;

    private Date usedTime;

    private Float ammenterSurplusNow;

    private Float ammenterSurplusLast;

    public Integer getAmmenterId() {
        return ammenterId;
    }

    public void setAmmenterId(Integer ammenterId) {
        this.ammenterId = ammenterId;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Float getAmmenterSurplusNow() {
        return ammenterSurplusNow;
    }

    public void setAmmenterSurplusNow(Float ammenterSurplusNow) {
        this.ammenterSurplusNow = ammenterSurplusNow;
    }

    public Float getAmmenterSurplusLast() {
        return ammenterSurplusLast;
    }

    public void setAmmenterSurplusLast(Float ammenterSurplusLast) {
        this.ammenterSurplusLast = ammenterSurplusLast;
    }

	public AmmeterUsedData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AmmeterUsedData(Integer ammenterId, Date usedTime, Float ammenterSurplusNow, Float ammenterSurplusLast) {
		super();
		this.ammenterId = ammenterId;
		this.usedTime = usedTime;
		this.ammenterSurplusNow = ammenterSurplusNow;
		this.ammenterSurplusLast = ammenterSurplusLast;
	}

	@Override
	public String toString() {
		return "AmmeterUsedData [ammenterId=" + ammenterId + ", usedTime=" + usedTime + ", ammenterSurplusNow="
				+ ammenterSurplusNow + ", ammenterSurplusLast=" + ammenterSurplusLast + "]";
	}
    
}