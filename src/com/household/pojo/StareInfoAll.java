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

	public Integer getStareId() {
		return stareId;
	}

	public void setStareId(Integer stareId) {
		this.stareId = stareId;
	}

	public String getStareTypeName() {
		return stareTypeName;
	}

	public void setStareTypeName(String stareTypeName) {
		this.stareTypeName = stareTypeName;
	}

	public String getStareLocation() {
		return stareLocation;
	}

	public void setStareLocation(String stareLocation) {
		this.stareLocation = stareLocation;
	}

	public String getStareName() {
		return stareName;
	}

	public void setStareName(String stareName) {
		this.stareName = stareName;
	}

	public Float getRent() {
		return rent;
	}

	public void setRent(Float rent) {
		this.rent = rent;
	}

	public Date getStareTimeStart() {
		return stareTimeStart;
	}

	public void setStareTimeStart(Date stareTimeStart) {
		this.stareTimeStart = stareTimeStart;
	}

	public Date getStareTimeEnd() {
		return stareTimeEnd;
	}

	public void setStareTimeEnd(Date stareTimeEnd) {
		this.stareTimeEnd = stareTimeEnd;
	}

	public String getStareOwnerName() {
		return stareOwnerName;
	}

	public void setStareOwnerName(String stareOwnerName) {
		this.stareOwnerName = stareOwnerName;
	}

	public String getStareOwnerTelephone() {
		return stareOwnerTelephone;
	}

	public void setStareOwnerTelephone(String stareOwnerTelephone) {
		this.stareOwnerTelephone = stareOwnerTelephone;
	}

	public StareInfoAll() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "StareInfoAll [stareId=" + stareId + ", stareTypeName=" + stareTypeName + ", stareLocation="
				+ stareLocation + ", stareName=" + stareName + ", rent=" + rent + ", stareTimeStart=" + stareTimeStart
				+ ", stareTimeEnd=" + stareTimeEnd + ", stareOwnerName=" + stareOwnerName + ", stareOwnerTelephone="
				+ stareOwnerTelephone + "]";
	}

	

    
}
