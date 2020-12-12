package com.household.pojo;

import java.util.Date;

public class AdRentInfo {
    private Integer adId;

    private String adBuyerName;

    private String adBuyerTelephone;

    private Date rentTimeStart;

    private Date rentTimeEnd;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdBuyerName() {
        return adBuyerName;
    }

    public void setAdBuyerName(String adBuyerName) {
        this.adBuyerName = adBuyerName == null ? null : adBuyerName.trim();
    }

    public String getAdBuyerTelephone() {
        return adBuyerTelephone;
    }

    public void setAdBuyerTelephone(String adBuyerTelephone) {
        this.adBuyerTelephone = adBuyerTelephone == null ? null : adBuyerTelephone.trim();
    }

    public Date getRentTimeStart() {
        return rentTimeStart;
    }

    public void setRentTimeStart(Date rentTimeStart) {
        this.rentTimeStart = rentTimeStart;
    }

    public Date getRentTimeEnd() {
        return rentTimeEnd;
    }

    public void setRentTimeEnd(Date rentTimeEnd) {
        this.rentTimeEnd = rentTimeEnd;
    }

	public AdRentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdRentInfo(Integer adId, String adBuyerName, String adBuyerTelephone, Date rentTimeStart, Date rentTimeEnd) {
		super();
		this.adId = adId;
		this.adBuyerName = adBuyerName;
		this.adBuyerTelephone = adBuyerTelephone;
		this.rentTimeStart = rentTimeStart;
		this.rentTimeEnd = rentTimeEnd;
	}

	@Override
	public String toString() {
		return "AdRentInfo [adId=" + adId + ", adBuyerName=" + adBuyerName + ", adBuyerTelephone=" + adBuyerTelephone
				+ ", rentTimeStart=" + rentTimeStart + ", rentTimeEnd=" + rentTimeEnd + "]";
	}
    
}