package com.androidServer.pojo;

public class Users {
	private Integer userId;
	private String userName;
	private String userPassword;
	private Integer power;
	private Integer superMange;
	private String remark;
	private String userAName;
	
	private String powerName;
	private String mangeName;
	
	public String getUserAName() {
		return userAName;
	}
	public void setUserAName(String userAName) {
		this.userAName = userAName;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public String getMangeName() {
		return mangeName;
	}
	public void setMangeName(String mangeName) {
		this.mangeName = mangeName;
	}
	public Integer getSuperMange() {
		return superMange;
	}
	public void setSuperMange(Integer superMange) {
		this.superMange = superMange;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
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
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", power="
				+ power + ", superMange=" + superMange + ", remark=" + remark + ", userAName=" + userAName
				+ ", powerName=" + powerName + ", mangeName=" + mangeName + "]";
	}
	 
	 
}
