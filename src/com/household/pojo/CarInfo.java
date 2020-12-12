package com.household.pojo;

public class CarInfo {
    private Integer carId;

    private String plate;

    private Integer parkingId;

    private Integer residentId;

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

	public CarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarInfo(Integer carId, String plate, Integer parkingId, Integer residentId) {
		super();
		this.carId = carId;
		this.plate = plate;
		this.parkingId = parkingId;
		this.residentId = residentId;
	}

	@Override
	public String toString() {
		return "CarInfo [carId=" + carId + ", plate=" + plate + ", parkingId=" + parkingId + ", residentId="
				+ residentId + "]";
	}
    
}