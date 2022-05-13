package com.eswar.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringstoUppercaseInJava8 {

	public static void main(String[] args) {
		// Before Java 8 
        System.out.println("Before Java 8");

        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        
        List<String> alphaUpper = new ArrayList<>();
        
        for (String s : alpha) {
        	alphaUpper.add(s.toUpperCase());
        }
        
        System.out.println(alpha); 
        System.out.println(alphaUpper); 
        
        
        // In Java 8
        
        System.out.println();
        System.out.println();
        System.out.println("In Java 8");
        
        List<String> collect = alpha.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        
        // Extra, streams apply to any data type.
System.out.println();
        
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);

        
	}

}
