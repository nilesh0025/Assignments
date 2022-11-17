package com.Assignment;

public class Health_Care {
	
     int id;
     
     String name;
     double height;
     double weight;
	public Health_Care() {
		super();
	}
	public Health_Care(int id, String name, double height, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
     
  public double bmi() {
	return weight/height*height;
	  
  }
		  

}
