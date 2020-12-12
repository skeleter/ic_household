package com.household.pojo;

public class ParkingInfo {
    private Integer parkingId;

    private String parkingLocation;

    private Float rent;

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation == null ? null : parkingLocation.trim();
    }

    public Float getRent() {
        return rent;
    }

    public void setRent(Float rent) {
        this.rent = rent;
    }

	public ParkingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingInfo(Integer parkingId, String parkingLocation, Float rent) {
		super();
		this.parkingId = parkingId;
		this.parkingLocation = parkingLocation;
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "ParkingInfo [parkingId=" + parkingId + ", parkingLocation=" + parkingLocation + ", rent=" + rent + "]";
	}
    
}