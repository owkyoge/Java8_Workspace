package com.eswar;

public class SampleConstructerTester {

	public static void main(String[] args) {

		SampleConstructerInterface i= SampleConstructer::new;
		SampleConstructer s1= i.get();
		SampleConstructer s2= i.get();
		
	}

}
