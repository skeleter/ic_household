package com.household.pojo;

public class HouseInfoAll{
	private Integer houseId;

    private Integer building;

    private Integer floor;

    private Integer room;

    private Integer houseTypeId;

    private Integer residentId;
    
    private String houseTypeName;

    private String haven;
	
	/**  
	 * @title: getHaven
	 * @description: TODO
	 * @return: String
	 */
	public String getHaven() {
		return haven;
	}

	/**
	 * @title: setHaven
	 * @description: TODO
	 * @return: String
	
	 */
	public void setHaven(String haven) {
		this.haven = haven;
	}

	/**  
	 * @title: getHouseId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getHouseId() {
		return houseId;
	}

	/**
	 * @title: setHouseId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	
	/**  
	 * @title: getBuilding
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getBuilding() {
		return building;
	}

	/**
	 * @title: setBuilding
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setBuilding(Integer building) {
		this.building = building;
	}

	
	/**  
	 * @title: getFloor
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getFloor() {
		return floor;
	}

	/**
	 * @title: setFloor
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	
	/**  
	 * @title: getRoom
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getRoom() {
		return room;
	}

	/**
	 * @title: setRoom
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setRoom(Integer room) {
		this.room = room;
	}

	
	/**  
	 * @title: getHouseTypeId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getHouseTypeId() {
		return houseTypeId;
	}

	/**
	 * @title: setHouseTypeId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setHouseTypeId(Integer houseTypeId) {
		this.houseTypeId = houseTypeId;
	}

	
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

	
	/**  
	 * @title: getHouseTypeName
	 * @description: TODO
	 * @return: String
	 */
	public String getHouseTypeName() {
		return houseTypeName;
	}

	/**
	 * @title: setHouseTypeName
	 * @description: TODO
	 * @return: String
	
	 */
	public void setHouseTypeName(String houseTypeName) {
		this.houseTypeName = houseTypeName;
	}

	public HouseInfoAll() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**   
	 * @title: toString
	 * @description: TODO
	 * @return   
	 * @see java.lang.Object#toString()     
	 */ 
	@Override
	public String toString() {
		return "HouseInfoAll [houseId=" + houseId + ", building=" + building + ", floor=" + floor + ", room=" + room
				+ ", houseTypeId=" + houseTypeId + ", residentId=" + residentId + ", houseTypeName=" + houseTypeName
				+ ", haven=" + haven + "]";
	}

	public HouseInfoAll(Integer houseId, Integer building, Integer floor, Integer room, Integer houseTypeId,
			Integer residentId, String houseTypeName, String haven) {
		super();
		this.houseId = houseId;
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.houseTypeId = houseTypeId;
		this.residentId = residentId;
		this.houseTypeName = houseTypeName;
		this.haven = haven;
	}
	
}
