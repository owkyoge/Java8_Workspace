package com.eswar;

import java.util.function.Predicate;

public class PredicateString {

	public static void main(String[] args) {

		String [] s = {"Pavan", "Yogi" , "Yeswanth" , "Mohan Sai" , "Manju" , "Indra"};
		
		Predicate<String>p=s1->s.length>5;
		for (String s1:s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}
		System.out.println();

		Predicate<String>p1=s1->s.length%2==0;
		for (String s1:s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
