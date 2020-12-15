package com.household.pojo;

import java.util.Date;

public class StareInfoAll {
	private Integer stareId;
    private String stareTypeName;
    private String stareLocation;

    private String stareName;

    private Float rent;

    private Date stareTimeStart;

    private Date stareTimeEnd;

    private String stareOwnerName;

    private String stareOwnerTelephone;

	
	/**  
	 * @title: getStareId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getStareId() {
		return stareId;
	}

	/**
	 * @title: setStareId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setStareId(Integer stareId) {
		this.stareId = stareId;
	}

	
	/**  
	 * @title: getStareTypeName
	 * @description: TODO
	 * @return: String
	 */
	public String getStareTypeName() {
		return stareTypeName;
	}

	/**
	 * @title: setStareTypeName
	 * @description: TODO
	 * @return: String
	
	 */
	public void setStareTypeName(String stareTypeName) {
		this.stareTypeName = stareTypeName;
	}

	
	/**  
	 * @title: getStareLocation
	 * @description: TODO
	 * @return: String
	 */
	public String getStareLocation() {
		return stareLocation;
	}

	/**
	 * @title: setStareLocation
	 * @description: TODO
	 * @return: String
	
	 */
	public void setStareLocation(String stareLocation) {
		this.stareLocation = stareLocation;
	}

	
	/**  
	 * @title: getStareName
	 * @description: TODO
	 * @return: String
	 */
	public String getStareName() {
		return stareName;
	}

	/**
	 * @title: setStareName
	 * @description: TODO
	 * @return: String
	
	 */
	public void setStareName(String stareName) {
		this.stareName = stareName;
	}

	
	/**  
	 * @title: getRent
	 * @description: TODO
	 * @return: Float
	 */
	public Float getRent() {
		return rent;
	}

	/**
	 * @title: setRent
	 * @description: TODO
	 * @return: Float
	
	 */
	public void setRent(Float rent) {
		this.rent = rent;
	}

	
	/**  
	 * @title: getStareTimeStart
	 * @description: TODO
	 * @return: Date
	 */
	public Date getStareTimeStart() {
		return stareTimeStart;
	}

	/**
	 * @title: setStareTimeStart
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setStareTimeStart(Date stareTimeStart) {
		this.stareTimeStart = stareTimeStart;
	}

	
	/**  
	 * @title: getStareTimeEnd
	 * @description: TODO
	 * @return: Date
	 */
	public Date getStareTimeEnd() {
		return stareTimeEnd;
	}

	/**
	 * @title: setStareTimeEnd
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setStareTimeEnd(Date stareTimeEnd) {
		this.stareTimeEnd = stareTimeEnd;
	}

	
	/**  
	 * @title: getStareOwnerName
	 * @description: TODO
	 * @return: String
	 */
	public String getStareOwnerName() {
		return stareOwnerName;
	}

	/**
	 * @title: setStareOwnerName
	 * @description: TODO
	 * @return: String
	
	 */
	public void setStareOwnerName(String stareOwnerName) {
		this.stareOwnerName = stareOwnerName;
	}

	
	/**  
	 * @title: getStareOwnerTelephone
	 * @description: TODO
	 * @return: String
	 */
	public String getStareOwnerTelephone() {
		return stareOwnerTelephone;
	}

	/**
	 * @title: setStareOwnerTelephone
	 * @description: TODO
	 * @return: String
	
	 */
	public void setStareOwnerTelephone(String stareOwnerTelephone) {
		this.stareOwnerTelephone = stareOwnerTelephone;
	}

	public StareInfoAll(Integer stareId, String stareTypeName, String stareLocation, String stareName, Float rent,
			Date stareTimeStart, Date stareTimeEnd, String stareOwnerName, String stareOwnerTelephone) {
		super();
		this.stareId = stareId;
		this.stareTypeName = stareTypeName;
		this.stareLocation = stareLocation;
		this.stareName = stareName;
		this.rent = rent;
		this.stareTimeStart = stareTimeStart;
		this.stareTimeEnd = stareTimeEnd;
		this.stareOwnerName = stareOwnerName;
		this.stareOwnerTelephone = stareOwnerTelephone;
	}

	public StareInfoAll() {
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
		return "StareInfoAll [stareId=" + stareId + ", stareTypeName=" + stareTypeName + ", stareLocation="
				+ stareLocation + ", stareName=" + stareName + ", rent=" + rent + ", stareTimeStart=" + stareTimeStart
				+ ", stareTimeEnd=" + stareTimeEnd + ", stareOwnerName=" + stareOwnerName + ", stareOwnerTelephone="
				+ stareOwnerTelephone + "]";
	}
    
}
