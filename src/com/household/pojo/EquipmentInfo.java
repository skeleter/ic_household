package com.household.pojo;

public class EquipmentInfo {
	private Integer equipmentId;

    private String equipmentLocation;

    private String equipmentUse;
    private String equipmentName;

    
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentLocation() {
        return equipmentLocation;
    }

    public void setEquipmentLocation(String equipmentLocation) {
        this.equipmentLocation = equipmentLocation == null ? null : equipmentLocation.trim();
    }

    public String getEquipmentUse() {
        return equipmentUse;
    }

    public void setEquipmentUse(String equipmentUse) {
        this.equipmentUse = equipmentUse == null ? null : equipmentUse.trim();
    }

	public EquipmentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipmentInfo(Integer equipmentId, String equipmentLocation, String equipmentUse,String equipmentName) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentLocation = equipmentLocation;
		this.equipmentUse = equipmentUse;
		this.equipmentName = equipmentName;
	}

	@Override
	public String toString() {
		return "EquipmentInfo [equipmentId=" + equipmentId + ", equipmentLocation=" + equipmentLocation
				+ ", equipmentUse=" + equipmentUse + ", equipmentName=" + equipmentName+"]";
	}
    
}