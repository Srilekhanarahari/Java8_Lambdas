package com.epam.Lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
        List<String> str_arr = Arrays.asList("apple","mom","civic","radar","laptop","madam");
        List<String> palindromes_list = Palindrome.findPal(str_arr, (str) -> Palindrome.isPal((String) str));
        System.out.println("The palindromes present in the given list are " + palindromes_list);
    }
    public static boolean isPal(String str) {
    	StringBuffer new_buff =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--) {
    	new_buff = new_buff.append(str.charAt(i));
    	}
    	if(str.equalsIgnoreCase(new_buff.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> sorted_palin = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i)))
    	.forEach((i) -> {
            sorted_palin.add((String) i);
        });
        return sorted_palin;
    	}
}
