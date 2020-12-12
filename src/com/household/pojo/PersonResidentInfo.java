package com.household.pojo;

public class PersonResidentInfo {
    private Integer residentId;

    private Integer amount;

    private Integer ownerId;

    public Integer getResidentId() {
        return residentId;
    }

    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

	public PersonResidentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonResidentInfo(Integer residentId, Integer amount, Integer ownerId) {
		super();
		this.residentId = residentId;
		this.amount = amount;
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "PersonResidentInfo [residentId=" + residentId + ", amount=" + amount + ", ownerId=" + ownerId + "]";
	}
    
}