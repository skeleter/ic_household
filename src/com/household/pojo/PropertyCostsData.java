package com.household.pojo;

import java.util.Date;

public class PropertyCostsData {
    private Integer houseId;
    private Integer costsId;
    
	/**  
	 * @title: getCostsId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getCostsId() {
		return costsId;
	}

	/**
	 * @title: setCostsId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setCostsId(Integer costsId) {
		this.costsId = costsId;
	}

	private Integer residentId;

    private Float propertyCosts;

    private Integer ownerId;

    private Date paymentTime;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getResidentId() {
        return residentId;
    }

    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

    public Float getPropertyCosts() {
        return propertyCosts;
    }

    public void setPropertyCosts(Float propertyCosts) {
        this.propertyCosts = propertyCosts;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

	public PropertyCostsData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyCostsData(Integer costsId ,Integer houseId, Integer residentId, Float propertyCosts, Integer ownerId,
			Date paymentTime) {
		super();
		this.houseId = houseId;
		this.residentId = residentId;
		this.propertyCosts = propertyCosts;
		this.ownerId = ownerId;
		this.paymentTime = paymentTime;
		this.costsId=costsId;
	}

	@Override
	public String toString() {
		return "PropertyCostsData [costsId="+costsId+",houseId=" + houseId + ", residentId=" + residentId + ", propertyCosts="
				+ propertyCosts + ", ownerId=" + ownerId + ", paymentTime=" + paymentTime + "]";
	}
    
}