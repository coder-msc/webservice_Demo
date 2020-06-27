package com.androidServer.pojo;

public class Mange {
private Integer mangeId;
private String mangeName;
public Integer getMangeId() {
	return mangeId;
}
public void setMangeId(Integer mangeId) {
	this.mangeId = mangeId;
}
public String getMangeName() {
	return mangeName;
}
public void setMangeName(String mangeName) {
	this.mangeName = mangeName;
}
@Override
public String toString() {
	return "Mange [mangeId=" + mangeId + ", mangeName=" + mangeName + "]";
}

}
