package com.household.pojo;

public class EquipmentInfo {
    private Integer equipmentId;

    private String equipmentLocation;

    private String equipmentUse;

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

	public EquipmentInfo(Integer equipmentId, String equipmentLocation, String equipmentUse) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentLocation = equipmentLocation;
		this.equipmentUse = equipmentUse;
	}

	@Override
	public String toString() {
		return "EquipmentInfo [equipmentId=" + equipmentId + ", equipmentLocation=" + equipmentLocation
				+ ", equipmentUse=" + equipmentUse + "]";
	}
    
}