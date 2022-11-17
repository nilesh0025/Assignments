package com.Pojo_Dao_;

public class Employee_Master {

	public static void main(String[] args) throws Exception {
		//Employee e=new Employee(2,"prakash",25000,10,"trainee","m");
		try {
			//Employee_Dao.insertEmployee(e);
			System.out.println(Employee_Dao.getEmployeesByDepartment("IT"));
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
			
		
		//System.out.println(Employee_Dao.getEmployeeById(1));
		}
	
	}

}