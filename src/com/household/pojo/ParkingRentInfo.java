package com.household.pojo;

import java.util.Date;

public class ParkingRentInfo {
    private Integer parkingId;

    private Integer residentId;

    private String plateNumber;

    private Date parkingTimeStart;

    private Date parkingTimeEnd;

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public Integer getResidentId() {
        return residentId;
    }

    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public Date getParkingTimeStart() {
        return parkingTimeStart;
    }

    public void setParkingTimeStart(Date parkingTimeStart) {
        this.parkingTimeStart = parkingTimeStart;
    }

    public Date getParkingTimeEnd() {
        return parkingTimeEnd;
    }

    public void setParkingTimeEnd(Date parkingTimeEnd) {
        this.parkingTimeEnd = parkingTimeEnd;
    }

	public ParkingRentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingRentInfo(Integer parkingId, Integer residentId, String plateNumber, Date parkingTimeStart,
			Date parkingTimeEnd) {
		super();
		this.parkingId = parkingId;
		this.residentId = residentId;
		this.plateNumber = plateNumber;
		this.parkingTimeStart = parkingTimeStart;
		this.parkingTimeEnd = parkingTimeEnd;
	}

	@Override
	public String toString() {
		return "ParkingRentInfo [parkingId=" + parkingId + ", residentId=" + residentId + ", plateNumber=" + plateNumber
				+ ", parkingTimeStart=" + parkingTimeStart + ", parkingTimeEnd=" + parkingTimeEnd + "]";
	}
    
}