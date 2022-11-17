package com.Collection_Assignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Hashmap_Sort {
      
	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		m.put("pune", 1020000);
		m.put("indore", 1200030);
		m.put("Amalner", 80000);
		m.put("dhule", 3000202);
		
	Map<String,Integer>w=	m.entrySet()
        .stream()
        .sorted((i1, i2)
                    -> i1.getKey().compareTo(
                        i2.getKey()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1, LinkedHashMap::new));
		
		for(Map.Entry<String , Integer> e:w.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
			
			
		}
			    }
			  }