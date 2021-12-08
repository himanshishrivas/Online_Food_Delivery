package com.cg.model;

public class Category {
	String catId;
	String catgoryName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String catId, String catgoryName) {
		super();
		this.catId = catId;
		this.catgoryName = catgoryName;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatgoryName() {
		return catgoryName;
	}
	public void setCatgoryName(String catgoryName) {
		this.catgoryName = catgoryName;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catgoryName=" + catgoryName + "]";
	}
	

}
