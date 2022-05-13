package com.eswar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsfilterandmapIn8 {

	public static void main(String[] args) {


        List<Person> persons = Arrays.asList(
        		new Person("Sai" , 15),
				new Person("Yogi" , 20),
				new Person("Pavan" , 25)
        );

        String name = persons.stream()
                .filter(x -> "Yogi".equals(x.getName()))
                .map(Person::getName)                    
                .findAny()
                .orElse("");

        System.out.println("name : " + name);
        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

	}
	
	


}
