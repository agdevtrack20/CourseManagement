package com.training.entities;

public class Course {
	
	private int id;
	private String title;
	private double price;
	
	public Course(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Course ID: "+ this.id+ 
				", Title : "+this.title+", Price: "+this.price;
	}

}
