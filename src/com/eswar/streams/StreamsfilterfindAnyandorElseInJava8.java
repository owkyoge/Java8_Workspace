package com.eswar.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsfilterfindAnyandorElseInJava8 {

	public static void main(String[] args) {
		  List<Person> persons = Arrays.asList(
					new Person("Sai" , 15),
					new Person("Yogi" , 20),
					new Person("Pavan" , 25)
	        );

	        Person result1 = persons.stream()                       
	                .filter(x -> "Yogi".equals(x.getName()))        
	                .findAny()                                      
	                .orElse(null);                                  

	        System.out.println(result1);
	        
	        Person result2 = persons.stream()
	                .filter(x -> "Mohan".equals(x.getName()))
	                .findAny()
	                .orElse(null);

	       

	        
	        System.out.println(result2);

	}

}
