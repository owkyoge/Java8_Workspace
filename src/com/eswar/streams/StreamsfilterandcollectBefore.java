package com.eswar.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsfilterandcollectBefore {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("Mohan" , "Yogi" , "Sai");
		List<String> result = getFilterOutput(lines , "Yogi");
		for (String temp : result) {
			System.out.println(temp);
		}
	
	}

	private static List<String> getFilterOutput(List<String> lines, String string) {
		List<String> l = new ArrayList<>();
		for(String line : lines) {
			if (!"Yogi".equals(line)) {
				l.add(line);
			}
		}
		return l;
	}

}
