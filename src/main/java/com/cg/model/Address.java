package com.cg.model;

public class Address {
	
	String addressId;
	String buildingName;
	String streetNo;
	String area;
	String city;
	String state;
	String country;
	String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressId, String buildingName, String streetNo, String area, String city, String state,
			String country, String pincode) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.streetNo = streetNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", streetNo=" + streetNo
				+ ", area=" + area + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + "]";
	}
	
	

}
