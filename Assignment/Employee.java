package com.Assignment;

public class Employee {
	int id;
       String name;
       double basicsalary;
       
       float da;
       float incometax;
       
	public Employee() {
		super();
	}

	public Employee(int id,String name, double basicsalary) {
		super();
		this.id=id;
		this.name = name;
		this.basicsalary = basicsalary;
		this.da = da;
		this.incometax = incometax;
		
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

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getIncometax() {
		return incometax;
	}

	public void setIncometax(float incometax) {
		this.incometax = incometax;
	}
	
       
  

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicsalary=" + basicsalary + 
				 "]";
	}

	public int netsalary() {
		
    	   da=(float) ((52*basicsalary)/100);
    	   System.out.println("DA ="+da);
    	   incometax=(float) ((30*basicsalary)/100);
    	   System.out.println("incometax ="+incometax);
    	 float  grosssalary=(float) (basicsalary+da);
    	 
    	   
		return (int) ((grosssalary)-(incometax));
    	   
       }
       
       
}
