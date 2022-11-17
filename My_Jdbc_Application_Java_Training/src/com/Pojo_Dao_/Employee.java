package com.Pojo_Dao_;

public class Employee {
int id;
String name;
int salary;
int deptid;
String designation;
char gender;
String s=" "+gender;
public Employee(int id, String name, int salary, int deptid, String designation, String s) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.deptid = deptid;
	this.designation = designation;
	this.s = s;
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
public String gets() {
	return s;
}
public void sets(String s) {
	this.s = s;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptid=" + deptid + ", designation="
			+ designation + ", gender=" + gender + "]";
}
public String getGender() {
	// TODO Auto-generated method stub
	return null;
}


}
