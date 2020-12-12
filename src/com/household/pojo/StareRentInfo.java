package com.household.pojo;

import java.util.Date;

public class StareRentInfo {
    private Integer stareId;

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
        this.stareOwnerName = stareOwnerName == null ? null : stareOwnerName.trim();
    }

    public String getStareOwnerTelephone() {
        return stareOwnerTelephone;
    }

    public void setStareOwnerTelephone(String stareOwnerTelephone) {
        this.stareOwnerTelephone = stareOwnerTelephone == null ? null : stareOwnerTelephone.trim();
    }

	public StareRentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StareRentInfo(Integer stareId, Date stareTimeStart, Date stareTimeEnd, String stareOwnerName,
			String stareOwnerTelephone) {
		super();
		this.stareId = stareId;
		this.stareTimeStart = stareTimeStart;
		this.stareTimeEnd = stareTimeEnd;
		this.stareOwnerName = stareOwnerName;
		this.stareOwnerTelephone = stareOwnerTelephone;
	}

	@Override
	public String toString() {
		return "StareRentInfo [stareId=" + stareId + ", stareTimeStart=" + stareTimeStart + ", stareTimeEnd="
				+ stareTimeEnd + ", stareOwnerName=" + stareOwnerName + ", stareOwnerTelephone=" + stareOwnerTelephone
				+ "]";
	}
	
}