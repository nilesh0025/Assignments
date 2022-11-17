package com.Pojo_Dao_;

public class Employee1 {
     
	int id;
	String name;
	int salary;
	int deptid;
	String designation;
	String gender;
	public Employee1(int id, String name, int salary, int deptid, String designation, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptid = deptid;
		this.designation = designation;
		this.gender = gender;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", deptid=" + deptid + ", designation="
				+ designation + ", gender=" + gender + "]";
	}
	
	
	
	
}
