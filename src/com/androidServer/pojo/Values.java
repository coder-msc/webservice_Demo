package com.androidServer.pojo;

public class Values {
	private   Integer itemId;
	private   String itemName;
	private   float itemValue;
	private   String itemTime;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemValue() {
		return itemValue;
	}
	public void setItemValue(float itemValue) {
		this.itemValue = itemValue;
	}
	public String getItemTime() {
		return itemTime;
	}
	public void setItemTime(String itemTime) {
		this.itemTime = itemTime;
	}
	@Override
	public String toString() {
		return "itemValues [itemId=" + itemId + ", itemName=" + itemName + ", itemValue=" + itemValue + ", itemTime="
				+ itemTime + "]";
	}
	
}
