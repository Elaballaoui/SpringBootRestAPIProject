package com.restapi.entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name="category")
	private String category;
	@Column(name="price")
	private float price;
	@Column(name="createdAt")
	private Date createdAt;
	@Column(name="updatedAt ")
	private Date updatedAt ;
	@Column(name="isEnabled")
	private boolean isEnabled;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String title, String description, String category, float price, Date createdAt, Date updatedAt, boolean isEnabled) {
		super();
		this.title = title;
		this.description=description;
		this.category=category;
		this.price = price;
		this.createdAt=createdAt;
		this.updatedAt=updatedAt;
		this.isEnabled=isEnabled;
	}


	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public float getprice() {
		return price;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public Date getcreatedAt() {
		return createdAt;
	}
	public void setcreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getupdatedAt() {
		return updatedAt;
	}
	public void setupdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean getisEnabled() {
		return isEnabled;
	}
	public void setisEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", title=" + title + ", description=" + description + ", category=" + category + ", price=" + price + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", isEnabled=" + isEnabled 
				+ "]";
	}
	
	

}
