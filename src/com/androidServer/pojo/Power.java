package com.androidServer.pojo;

public class Power {
private Integer powerId;
private String powerName;
public Integer getPowerId() {
	return powerId;
}
public void setPowerId(Integer powerId) {
	this.powerId = powerId;
}
public String getPowerName() {
	return powerName;
}
public void setPowerName(String powerName) {
	this.powerName = powerName;
}
@Override
public String toString() {
	return "Power [powerId=" + powerId + ", powerName=" + powerName + "]";
}

}
