package com.epam.Lambda_expression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

public class Average{
	static void avg(List<Integer> list) {
		list.stream() 
			    .mapToInt(i -> i) 
			    .average() 
			    .ifPresent(avg -> System.out.println("Average found is " + avg));
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13, 17, 19, 23, 29);
		avg(list);
		
	}
}
