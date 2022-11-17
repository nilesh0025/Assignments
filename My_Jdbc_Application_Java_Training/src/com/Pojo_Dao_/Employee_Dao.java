package com.Pojo_Dao_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc_master.Connection_Master;
import com.mysql.cj.xdevapi.PreparableStatement;

public class Employee_Dao {
	public static void insertEmployee(Employee e) throws Exception{
	    
        
        Connection conn = Connection_Master.getConnection();
        PreparedStatement pst= conn.prepareStatement("insert into Employee(id,ename, salary,deptid,designation,gender) values(?,?,?,?,?,?)");
        pst.setInt(1, e.getId());
        pst.setString(2, e.getName());
        pst.setInt(3, e.getSalary());
        pst.setInt(4, e.getDeptid());
        pst.setString(5, e.getDesignation());    
        pst.setString(6, e.getGender());
        
        pst.executeUpdate();
        conn.close();
        
        
    }
    
//public static void updateEmployee(Employee1 e) throws Exception {
//        
//        Connection conn = ConnectionMaster.getConnection();
//        PreparedStatement pst= conn.prepareStatement("update employee1 set ename=?, salary=?, deptid=?, designation=? where eid=?");
//        pst.executeUpdate();
//        conn.close();
//        
//        
//}
public static Employee getEmployeeById(int id) throws Exception{
    List<Employee> employees=new ArrayList<Employee>();
    Connection conn=Connection_Master.getConnection();
    PreparedStatement pst= conn.prepareStatement("select * from employee where id=?");
    pst.setInt(1, id);
    //Statement st=conn.createStatement();
    //st.executeQuery("select * from employee");
    
    ResultSet rs=pst.executeQuery();
//    st.set
//	Connection conn=Connection_Master.getConnection();
//	
//	PreparedStatement pst=conn.prepareStatement("select employee set ename=?,salary=?,deptid=?,designation=?,gender=?");
//	
//	
//	
    if(rs.next()) 
	return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
    else {
    	System.out.println("id not found");
    	return null;
    }

}

public static List<Employee> getEmployeesByDepartment( String name) throws SQLException{
	
	List<Employee> e=new ArrayList<Employee>();
	Connection conn=Connection_Master.getConnection();
	PreparedStatement pst=conn.prepareStatement(" select * from employee where deptid=(select deptid from department where dname=?) ");
	pst.setString(1, name);
	ResultSet rs=pst.executeQuery();
	
	
	while(rs.next()) {
		
		e.add(new Employee (rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
		
	}
	
	
	return e;

	
}
}


