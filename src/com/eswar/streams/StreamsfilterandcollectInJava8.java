package com.eswar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsfilterandcollectInJava8 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("Mohan" , "Yogi" , "Sai");
		List<String> result= lines.stream()
				.filter(line->!"Yogi".equals(line))
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);

	}

}
                     
