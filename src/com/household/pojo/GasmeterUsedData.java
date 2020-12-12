package com.household.pojo;

import java.util.Date;

public class GasmeterUsedData {
    private Integer gasmeterId;

    private Date usedTime;

    private Float gameterSurplusLast;

    private Float gameterSurplusNow;

    public Integer getGasmeterId() {
        return gasmeterId;
    }

    public void setGasmeterId(Integer gasmeterId) {
        this.gasmeterId = gasmeterId;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Float getGameterSurplusLast() {
        return gameterSurplusLast;
    }

    public void setGameterSurplusLast(Float gameterSurplusLast) {
        this.gameterSurplusLast = gameterSurplusLast;
    }

    public Float getGameterSurplusNow() {
        return gameterSurplusNow;
    }

    public void setGameterSurplusNow(Float gameterSurplusNow) {
        this.gameterSurplusNow = gameterSurplusNow;
    }

	public GasmeterUsedData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GasmeterUsedData(Integer gasmeterId, Date usedTime, Float gameterSurplusLast, Float gameterSurplusNow) {
		super();
		this.gasmeterId = gasmeterId;
		this.usedTime = usedTime;
		this.gameterSurplusLast = gameterSurplusLast;
		this.gameterSurplusNow = gameterSurplusNow;
	}

	@Override
	public String toString() {
		return "GasmeterUsedData [gasmeterId=" + gasmeterId + ", usedTime=" + usedTime + ", gameterSurplusLast="
				+ gameterSurplusLast + ", gameterSurplusNow=" + gameterSurplusNow + "]";
	}
    
}