package com.household.pojo;

import java.util.List;

public class PersonResidentInfoAll {
	private Integer residentId;
    private Integer amount;
    private Integer ownerId;
    private Integer houseId;
    private Integer building;
    private Integer floor;
    private Integer room;
    private List<PersonOwnerInfo> list;
	
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
	 * @title: getAmount
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @title: setAmount
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
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
	 * @title: getList
	 * @description: TODO
	 * @return: List<PersonOwnerInfo>
	 */
	public List<PersonOwnerInfo> getList() {
		return list;
	}
	/**
	 * @title: setList
	 * @description: TODO
	 * @return: List<PersonOwnerInfo>
	
	 */
	public void setList(List<PersonOwnerInfo> list) {
		this.list = list;
	}
	public PersonResidentInfoAll(Integer residentId, Integer amount, Integer ownerId, Integer houseId, Integer building,
			Integer floor, Integer room, List<PersonOwnerInfo> list) {
		super();
		this.residentId = residentId;
		this.amount = amount;
		this.ownerId = ownerId;
		this.houseId = houseId;
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.list = list;
	}
	public PersonResidentInfoAll() {
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
		return "PersonResidentInfoAll [residentId=" + residentId + ", amount=" + amount + ", ownerId=" + ownerId
				+ ", houseId=" + houseId + ", building=" + building + ", floor=" + floor + ", room=" + room + ", list="
				+ list + "]";
	}
    
}
