package com.household.pojo;

import java.util.Date;

public class CarIoData {
    private Integer carId;

    private String plate;

    private Date inTime;

    private Date outTime;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate == null ? null : plate.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

	public CarIoData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarIoData(Integer carId, String plate, Date inTime, Date outTime) {
		super();
		this.carId = carId;
		this.plate = plate;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "CarIoData [carId=" + carId + ", plate=" + plate + ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
    
}