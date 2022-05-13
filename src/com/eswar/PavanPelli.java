package com.eswar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PavanPelli {

	public List<String> getTentItemds() {

		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);
		List<String> lst = new ArrayList<>();

		/*
		 * lst.add("SPOON11");
		 * 
		 * lst.add("vessel11"); lst.add("glass11"); lst.add("jug11"); lst.add("mug11");
		 */

		return lst;
	}

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);

		Supplier<LocalDateTime> s = () ->  LocalDateTime.now();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  

		System.out.println(s.get());

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		System.out.println("asking for delivery items");

		System.out.println("4");
		System.out.println("5");

	//	System.out.println(l);

		/*
		 * Consumer<List<String>> consumer = (List<String> t) -> {
		 * System.out.println(t);
		 * 
		 * System.out.println("11"); System.out.println("22"); System.out.println("32");
		 * System.out.println("44"); System.out.println("54"); };
		 * 
		 * 
		 * 
		 * System.out.println("111"); System.out.println("222");
		 * System.out.println("322"); System.out.println("444");
		 * System.out.println("544");
		 * 
		 * consumer.accept(l);
		 */

	}

}
