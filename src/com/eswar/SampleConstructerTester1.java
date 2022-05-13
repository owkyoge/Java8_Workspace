package com.eswar;

import java.util.ArrayList;
import java.util.List;

public class SampleConstructerTester1 {

	public static void main(String[] args) {

		SampleConstructerInterface1 i= SampleConstructer1::new;
		SampleConstructer1 s1=i.get("Yogi");
		
		
		List<String> l = new ArrayList<String>();
		l.add("AAA");
		l.add("BBBB");
		l.add("CCC");
		l.add("DDDD");
		
		for (String s : l) {

			if (!s.equalsIgnoreCase("CCC")) {
			System.out.println(s);
			}

		
		}
		
		
		
		
		
	}

}
