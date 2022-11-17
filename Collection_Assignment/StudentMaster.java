package com.Collection_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

 class Student implements Comparable<Student>{

     int rollno;
     String name;
     String classname;
     int totalmarks;
    
     
     
     
	public Student() {
		super();
	}



	public Student(int rollno, String name, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.classname = classname;
		this.totalmarks = totalmarks;
		
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getClassname() {
		return classname;
	}



	public void setClassname(String classname) {
		
		
		this.classname = classname;
	}



	public int getTotalmarks() {
		return totalmarks;
	}



	public void setTotalmarks(int totalmarks) {	
		
		//double p=this.totalmarks/500*100;
		
//		if(p>50) {
//			  
//			System.out.println("passing :"+p);
//					}
//		else if(p<30){
//			System.out.println("failed :"+p);
//		}
	
		this.totalmarks = totalmarks;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}






@Override
public int compareTo(Student o) {
	
	return this.name.compareTo(o.name);
}
}
	public class StudentMaster{
		public static void main(String[] args) {
			
			
			
			
			List<Student> a=new ArrayList<Student>();
			
			
//			int f[]= {1,2,3,4,5};
//			String n[]= {"nilesh","prakash","bhushan","jayesh","pratiksha"};
//			String s3[]= {"mechanical","mechanical","mechanical","mechanical","mechanical"};
//			int t[]= {450,300,380,425,422};
//			
//			for(int i=0;i<5;i++) {
//				Student s1=new Student(f[i],n[i],s3[i],t[i]);
//				a.add(s1);
//				a.get(i).display();
//			}
			a.add(new Student(1,"nilesh","mechanical",450));
			a.add(new Student(2,"prakash","mechanical",300));
			a.add(new Student(3,"bhushan","mechanical",380));
			a.add(new Student(4,"jayesh","mechanical",425));
			a.add(new Student(5,"pratiksha","mechanical",422));
			
			System.out.println("*********************************************************************************");

		
			for(Student s:a) {
				
				float b=s.totalmarks*100/500;
				if(b>=50) {
					
				System.out.println("Student above average are :"+s+" Average :"+b);
			}else {
				
				System.out.println("Student above average are :"+s+" Average :"+b);
			}if(b<30) {
				System.out.println("failed students are :"+s+" Average :"+b);
			}
			
			}
  
		System.out.println("*********************************************************************************");
		
			Collections.sort(a);
			System.out.println("According to name :"+a);
			
		
	//	System.out.println("Maximum Total Marks Contained Student :"+Collections.max(a));
			System.out.println("*********************************************************************************");
              
			Optional<Student>	maxmarks=a.stream()
			        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed()).findFirst();
			       System.out.println("Second Maximum Total Marks Contained Student :"+maxmarks);

			
			
	Optional<Student>	seconmaxmarks=a.stream()
        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed()).skip(1).findFirst();
       System.out.println("Second Maximum Total Marks Contained Student :"+seconmaxmarks);
       
       Optional<Student>	thirdnmaxmarks=a.stream()
    	        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed()).skip(2).findFirst();
       System.out.println("Second Maximum Total Marks Contained Student :"+thirdnmaxmarks);
				}
			
			
						}
									
		
	
	




