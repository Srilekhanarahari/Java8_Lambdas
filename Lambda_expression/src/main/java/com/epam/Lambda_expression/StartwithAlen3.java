package com.epam.Lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StartwithAlen3 {
	public static List<String> search(List<String> array_a_3) {
		return array_a_3
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> str_list = new ArrayList<String>();
		    str_list.add("aww"); 
		    str_list.add("sri"); 
		    str_list.add("choco");
		    str_list.add("sai");
		    str_list.add("apple"); 
		    str_list.add("epam");
		    str_list.add("ant");
		    str_list.add("august");
	        List<String> array_a_3 = search(str_list); 
	        System.out.println(array_a_3);
   	}

}
