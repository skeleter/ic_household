package com.household.pojo;

import java.util.Date;

public class PersonRenterInfo {
	private Integer renterId;
	private Integer ownerId;
	private Date timeStart;
	private Date timeEnd;
	
	/**  
	 * @title: getRenterId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getRenterId() {
		return renterId;
	}
	/**
	 * @title: setRenterId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setRenterId(Integer renterId) {
		this.renterId = renterId;
	}
	
	/**  
	 * @title: getOwnerId
	 * @description: TODO
	 * @return: Integer
	 */
	public Integer getOwnerId() {
		return ownerId;
	}
	/**
	 * @title: setOwnerId
	 * @description: TODO
	 * @return: Integer
	
	 */
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	
	/**  
	 * @title: getTimeStart
	 * @description: TODO
	 * @return: Date
	 */
	public Date getTimeStart() {
		return timeStart;
	}
	/**
	 * @title: setTimeStart
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
	
	/**  
	 * @title: getTimeEnd
	 * @description: TODO
	 * @return: Date
	 */
	public Date getTimeEnd() {
		return timeEnd;
	}
	/**
	 * @title: setTimeEnd
	 * @description: TODO
	 * @return: Date
	
	 */
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public PersonRenterInfo(Integer renterId, Integer ownerId, Date timeStart, Date timeEnd) {
		super();
		this.renterId = renterId;
		this.ownerId = ownerId;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	public PersonRenterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**   
	 * @title: toString
	 * @description: TODO
	 * @return   
	 * @see java.lang.Object#toString()     
	 */ 
	@Override
	public String toString() {
		return "PersonRenterInfo [renterId=" + renterId + ", ownerId=" + ownerId + ", timeStart=" + timeStart
				+ ", timeEnd=" + timeEnd + "]";
	}
	
}
