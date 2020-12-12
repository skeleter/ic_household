package com.household.pojo;

public class HouseInfo {
    private Integer houseId;

    private Integer building;

    private Integer floor;

    private Integer room;

    private Integer houseTypeId;

    private Integer residentId;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Integer getResidentId() {
        return residentId;
    }

    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

	public HouseInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HouseInfo(Integer houseId, Integer building, Integer floor, Integer room, Integer houseTypeId,
			Integer residentId) {
		super();
		this.houseId = houseId;
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.houseTypeId = houseTypeId;
		this.residentId = residentId;
	}

	@Override
	public String toString() {
		return "HouseInfo [houseId=" + houseId + ", building=" + building + ", floor=" + floor + ", room=" + room
				+ ", houseTypeId=" + houseTypeId + ", residentId=" + residentId + "]";
	}
    
}