package com.eswar;

public class MyRunnableTester {

	public static void main(String[] args) {

		/* MyRunnable r = new MyRunnable();*/
	
		
		Thread t = new Thread(); 
		t.start();
		for (int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
