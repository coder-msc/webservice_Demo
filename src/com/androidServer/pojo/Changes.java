package com.androidServer.pojo;

import java.util.Date;

public class Changes {
	
private Integer id;
private String deviceName;
private String deviceVal;
private String userName;
private Date changeDate;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDeviceName() {
	return deviceName;
}
public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}
public String getDeviceVal() {
	return deviceVal;
}
public void setDeviceVal(String deviceVal) {
	this.deviceVal = deviceVal;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Date getChangeDate() {
	return changeDate;
}
public void setChangeDate(Date changeDate) {
	this.changeDate = changeDate;
}
@Override
public String toString() {
	return "Changes [id=" + id + ", deviceName=" + deviceName + ", deviceVal=" + deviceVal + ", userName=" + userName
			+ ", changeDate=" + changeDate + "]";
}



}
