package com.cg.model;

import java.util.List;


/* A Restaurant belongs to an Address, it can have many items. */

public class Restaurant<ItemList> {
	String retaurantId;
	String restaurantName;
	Address address;
	String managerName;
	String contactNumber;
	
	List<Item> itemList;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String retaurantId, String restaurantName, Address address, String managerName,
			String contactNumber, List<Item> itemList) {
		super();
		this.retaurantId = retaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
		this.itemList = itemList;
	}

	public String getRetaurantId() {
		return retaurantId;
	}

	public void setRetaurantId(String retaurantId) {
		this.retaurantId = retaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Restaurant [retaurantId=" + retaurantId + ", restaurantName=" + restaurantName + ", managerName="
				+ managerName + ", contactNumber=" + contactNumber + "]";
	}
	
	
	
	
	

}
