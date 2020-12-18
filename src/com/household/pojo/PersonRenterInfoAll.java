package com.household.pojo;

import java.util.Date;

public class PersonRenterInfoAll {
    private Integer residentId;
    private Integer building;
    private Integer floor;
    private Integer room;
    private Integer ownerId;
    private String ownerName;
    private String ownerSex;
    private String ownerTelephone;
    private Date timeStart;
	private Date timeEnd;
	
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
	 * @title: getOwnerId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getOwnerId() {
		return ownerId;
	}
	/**
	 * @title: setOwnerId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	
	/**  
	 * @title: getOwnerName
	 * @description: TODO
	 * @return: String
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @title: setOwnerName
	 * @description: TODO
	 * @return: String
	
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**  
	 * @title: getOwnerSex
	 * @description: TODO
	 * @return: String
	 */
	public String getOwnerSex() {
		return ownerSex;
	}
	/**
	 * @title: setOwnerSex
	 * @description: TODO
	 * @return: String
	
	 */
	public void setOwnerSex(String ownerSex) {
		this.ownerSex = ownerSex;
	}
	
	/**  
	 * @title: getOwnerTelephone
	 * @description: TODO
	 * @return: String
	 */
	public String getOwnerTelephone() {
		return ownerTelephone;
	}
	/**
	 * @title: setOwnerTelephone
	 * @description: TODO
	 * @return: String
	
	 */
	public void setOwnerTelephone(String ownerTelephone) {
		this.ownerTelephone = ownerTelephone;
	}
	
	/**  
	 * @title: getTimeStart
	 * @description: TODO
	 * @return: Date
	 */
	public Date getTimeStart() {
		return timeStart;
	}
	/**
	 * @title: setTimeStart
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
	
	/**  
	 * @title: getTimeEnd
	 * @description: TODO
	 * @return: Date
	 */
	public Date getTimeEnd() {
		return timeEnd;
	}
	/**
	 * @title: setTimeEnd
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public PersonRenterInfoAll(Integer residentId, Integer building, Integer floor, Integer room, Integer ownerId,
			String ownerName, String ownerSex, String ownerTelephone, Date timeStart, Date timeEnd) {
		super();
		this.residentId = residentId;
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerSex = ownerSex;
		this.ownerTelephone = ownerTelephone;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	public PersonRenterInfoAll() {
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
		return "PersonRenterInfoAll [residentId=" + residentId + ", building=" + building + ", floor=" + floor
				+ ", room=" + room + ", ownerId=" + ownerId + ", ownerName=" + ownerName + ", ownerSex=" + ownerSex
				+ ", ownerTelephone=" + ownerTelephone + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + "]";
	}
	
}
