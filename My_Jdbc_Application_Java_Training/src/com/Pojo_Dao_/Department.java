package com.Pojo_Dao_;

public class Department {
     int deptid;
     String name;
	public Department(int deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + "]";
	}
     
     
}
