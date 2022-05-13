package com.eswar;

public class FunctionalInterfaceTester {

	
	
	
	public static void main(String[] args) {

		FunctionalInterfaceTest1 f = (a, b)-> a+b;
			
			int add = f.cal(10, 20);
			
			
			
			System.out.println(add);
			
			FunctionalInterfaceTest1 f1 = (a, b)-> {return a*b; };
			int add1 = f1.cal(10, 20);
			System.out.println(add1);
 	}
	

	
	

}
