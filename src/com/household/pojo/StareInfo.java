package com.household.pojo;

public class StareInfo {
    private Integer stareId;

    private Integer stareTpyeId;

    private String stareLocation;

    private String stareName;

    private Float rent;

    public Integer getStareId() {
        return stareId;
    }

    public void setStareId(Integer stareId) {
        this.stareId = stareId;
    }

    public Integer getStareTpyeId() {
        return stareTpyeId;
    }

    public void setStareTpyeId(Integer stareTpyeId) {
        this.stareTpyeId = stareTpyeId;
    }

    public String getStareLocation() {
        return stareLocation;
    }

    public void setStareLocation(String stareLocation) {
        this.stareLocation = stareLocation == null ? null : stareLocation.trim();
    }

    public String getStareName() {
        return stareName;
    }

    public void setStareName(String stareName) {
        this.stareName = stareName == null ? null : stareName.trim();
    }

    public Float getRent() {
        return rent;
    }

    public void setRent(Float rent) {
        this.rent = rent;
    }

	public StareInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StareInfo(Integer stareId, Integer stareTpyeId, String stareLocation, String stareName, Float rent) {
		super();
		this.stareId = stareId;
		this.stareTpyeId = stareTpyeId;
		this.stareLocation = stareLocation;
		this.stareName = stareName;
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "StareInfo [stareId=" + stareId + ", stareTpyeId=" + stareTpyeId + ", stareLocation=" + stareLocation
				+ ", stareName=" + stareName + ", rent=" + rent + "]";
	}
    
}