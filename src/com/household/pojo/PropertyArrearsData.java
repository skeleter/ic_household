package com.household.pojo;

import java.util.Date;

public class PropertyArrearsData {
    private Integer houseId;
    private Integer arrearsId;
    private Integer residentId;
    private Float propertyArrears;
    private Date propertyTime;
    
	/**  
	 * @title: getArrearsId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getArrearsId() {
		return arrearsId;
	}

	/**
	 * @title: setArrearsId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setArrearsId(Integer arrearsId) {
		this.arrearsId = arrearsId;
	}

	

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

    public Float getPropertyArrears() {
        return propertyArrears;
    }

    public void setPropertyArrears(Float propertyArrears) {
        this.propertyArrears = propertyArrears;
    }

    public Date getPropertyTime() {
        return propertyTime;
    }

    public void setPropertyTime(Date propertyTime) {
        this.propertyTime = propertyTime;
    }

	public PropertyArrearsData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyArrearsData(Integer arrearsId,Integer houseId, Integer residentId, Float propertyArrears, Date propertyTime) {
		super();
		this.houseId = houseId;
		this.residentId = residentId;
		this.propertyArrears = propertyArrears;
		this.propertyTime = propertyTime;
		this.arrearsId=arrearsId;
	}

	@Override
	public String toString() {
		return "PropertyArrearsData [houseId=" + houseId + ", arrearsId=" + arrearsId + ", residentId=" + residentId + ", propertyArrears="
				+ propertyArrears + ", propertyTime=" + propertyTime + "]";
	}
    
}