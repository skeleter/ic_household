package com.household.pojo;

public class AdInfo {
    private Integer adId;

    private Integer adTypeId;

    private String adLocation;

    private Float rent;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdTypeId() {
        return adTypeId;
    }

    public void setAdTypeId(Integer adTypeId) {
        this.adTypeId = adTypeId;
    }

    public String getAdLocation() {
        return adLocation;
    }

    public void setAdLocation(String adLocation) {
        this.adLocation = adLocation == null ? null : adLocation.trim();
    }

    public Float getRent() {
        return rent;
    }

    public void setRent(Float rent) {
        this.rent = rent;
    }

	public AdInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdInfo(Integer adId, Integer adTypeId, String adLocation, Float rent) {
		super();
		this.adId = adId;
		this.adTypeId = adTypeId;
		this.adLocation = adLocation;
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "AdInfo [adId=" + adId + ", adTypeId=" + adTypeId + ", adLocation=" + adLocation + ", rent=" + rent
				+ "]";
	}
    
}