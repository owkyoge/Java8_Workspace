package com.eswar.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsfilterfindAnyandorElseBefore {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("Sai" , 15),
				new Person("Yogi" , 20),
				new Person("Pavan" , 25)
				);
		
		Person result = getStudentByName(persons , "Yogi");
		System.out.println(result);
	}

	private static Person getStudentByName(List<Person> persons, String name) {
		Person result =null;
		for (Person temp : persons) {
			if(name.equals(temp.getName())) {
				result = temp;
			}
		}

			
		
		return result;
		
	}

}
