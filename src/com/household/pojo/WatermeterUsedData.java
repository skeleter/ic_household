package com.household.pojo;

import java.util.Date;

public class WatermeterUsedData {
    private Integer watermeterId;

    private Date usedTime;

    private Float watermeterSurplusLast;

    private Float watermeterSurplusNow;

    public Integer getWatermeterId() {
        return watermeterId;
    }

    public void setWatermeterId(Integer watermeterId) {
        this.watermeterId = watermeterId;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Float getWatermeterSurplusLast() {
        return watermeterSurplusLast;
    }

    public void setWatermeterSurplusLast(Float watermeterSurplusLast) {
        this.watermeterSurplusLast = watermeterSurplusLast;
    }

    public Float getWatermeterSurplusNow() {
        return watermeterSurplusNow;
    }

    public void setWatermeterSurplusNow(Float watermeterSurplusNow) {
        this.watermeterSurplusNow = watermeterSurplusNow;
    }

	public WatermeterUsedData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WatermeterUsedData(Integer watermeterId, Date usedTime, Float watermeterSurplusLast,
			Float watermeterSurplusNow) {
		super();
		this.watermeterId = watermeterId;
		this.usedTime = usedTime;
		this.watermeterSurplusLast = watermeterSurplusLast;
		this.watermeterSurplusNow = watermeterSurplusNow;
	}

	@Override
	public String toString() {
		return "WatermeterUsedData [watermeterId=" + watermeterId + ", usedTime=" + usedTime
				+ ", watermeterSurplusLast=" + watermeterSurplusLast + ", watermeterSurplusNow=" + watermeterSurplusNow
				+ "]";
	}
    
}