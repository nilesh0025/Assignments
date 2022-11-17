package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMaster {
 public static void main(String[] args) {
	Integer arr[]= {2,3,1,5,6,11,19,21,8,15};
	List<Integer> myList=Arrays.asList(arr);
	//myList.stream().forEach((e)->System.out.print(e+" "));
	System.out.println();
	//myList.stream().map((e)->e*e).forEach((e)->System.out.print(e+" "));
	System.out.println();
	//myList.stream().filter((e)->e%2==0).map((e)->System.out.print(e+" "));
	
	List<String> names=new ArrayList<String>();
	names.add("Jack");
	names.add("Jill");
	names.add("John");
	names.add("Jim");
	names.add("Jim");
	names.add("Frank");
	employees.stream().forEach((e)->System.out.println(e)); Map<Integer, String>
		  m1=employees.stream().collect(Collectors.toMap(Empl::getId, Empl::getName));
		  // System.out.println(m1); Map<String, List<Empl>>
		  t1=employees.stream().collect(Collectors.groupingBy(Empl::getDepartment));
		  t1.keySet().stream().forEach((d)->System.out.println(d+" "+t1.get(d)));
		  employees.stream().sorted((e1,e2)->e2.getSalary()).limit(3).map(e->e.getName(
		  )).forEach(e->System.out.println(e)); Map<String, Optional<Empl>>
		  m2=employees.stream().collect(Collectors.groupingBy(Empl::getDepartment,
		  Collectors.maxBy((e1,e2)->e1.getSalary()-e2.getSalary())));
		  System.out.println(m2);
		 
		List<Integer> list2=Arrays.asList(2,3,5,7,3,565,8,3,7,78,94);
		List<Integer> e1=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(e1);
		List<Empl> e2=employees.stream().sorted((e3,e4)->e4.id-e3.id).collect(Collectors.toList());
		System.out.println(e2);
		LinkedHashSet<Empl> f2=employees.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(f2);
		Stream.iterate(1,n->n+n).limit(10).forEach(System.out::println);
		List<Integer> ik=list2.stream().collect(Collectors.toList());
	
}
}
