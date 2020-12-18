package com.household.pojo;

public class ParkingInfo {
    private Integer parkingId;

    private String parkingLocation;

    private Float rent;
    private Integer residentId;

    
	/**  
	 * @title: getResidentId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getResidentId() {
		return residentId;
	}

	/**
	 * @title: setResidentId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setResidentId(Integer residentId) {
		this.residentId = residentId;
	}

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

	public ParkingInfo(Integer parkingId, String parkingLocation, Float rent,Integer residentId) {
		super();
		this.parkingId = parkingId;
		this.parkingLocation = parkingLocation;
		this.rent = rent;
		this.residentId=residentId;
	}

	@Override
	public String toString() {
		return "ParkingInfo [parkingId=" + parkingId + ", parkingLocation=" + parkingLocation + ", rent=" + rent + ", residentId=" + residentId + "]";
	}
    
}