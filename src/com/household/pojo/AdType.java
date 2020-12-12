package com.household.pojo;

public class AdType {
    private Integer adTypeId;

    private String adTypeName;

    public Integer getAdTypeId() {
        return adTypeId;
    }

    public void setAdTypeId(Integer adTypeId) {
        this.adTypeId = adTypeId;
    }

    public String getAdTypeName() {
        return adTypeName;
    }

    public void setAdTypeName(String adTypeName) {
        this.adTypeName = adTypeName == null ? null : adTypeName.trim();
    }

	public AdType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdType(Integer adTypeId, String adTypeName) {
		super();
		this.adTypeId = adTypeId;
		this.adTypeName = adTypeName;
	}

	@Override
	public String toString() {
		return "AdType [adTypeId=" + adTypeId + ", adTypeName=" + adTypeName + "]";
	}
    
}