package com.household.pojo;

public class PersonOwnerInfo {
    private Integer ownerId;

    private Integer residentId;

    private String ownerName;

    private String ownerSex;

    private String ownerTelephone;

    private String ownerType;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getResidentId() {
        return residentId;
    }

    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerSex() {
        return ownerSex;
    }

    public void setOwnerSex(String ownerSex) {
        this.ownerSex = ownerSex == null ? null : ownerSex.trim();
    }

    public String getOwnerTelephone() {
        return ownerTelephone;
    }

    public void setOwnerTelephone(String ownerTelephone) {
        this.ownerTelephone = ownerTelephone == null ? null : ownerTelephone.trim();
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

	public PersonOwnerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonOwnerInfo(Integer ownerId, Integer residentId, String ownerName, String ownerSex,
			String ownerTelephone, String ownerType) {
		super();
		this.ownerId = ownerId;
		this.residentId = residentId;
		this.ownerName = ownerName;
		this.ownerSex = ownerSex;
		this.ownerTelephone = ownerTelephone;
		this.ownerType = ownerType;
	}

	@Override
	public String toString() {
		return "PersonOwnerInfo [ownerId=" + ownerId + ", residentId=" + residentId + ", ownerName=" + ownerName
				+ ", ownerSex=" + ownerSex + ", ownerTelephone=" + ownerTelephone + ", ownerType=" + ownerType + "]";
	}
    
}