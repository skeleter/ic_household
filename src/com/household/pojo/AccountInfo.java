package com.household.pojo;

public class AccountInfo {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

	public AccountInfo(Integer userId, String userName, String userPassword, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}

	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountInfo [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userType=" + userType + "]";
	}
    
}