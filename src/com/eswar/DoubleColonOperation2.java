package com.eswar;

public class DoubleColonOperation2 {
	
	public static void sum(int x, int y) {
		
		System.out.println("The sum : " +(x+y));
		
	}


	public static void main(String[] args) {

		DoubleColonOperationInterf i = (a,b)-> System.out.println("The sum : " +(a+b));
		i.add(10, 20);
		
		DoubleColonOperationInterf i1 = DoubleColonOperation2 :: sum;
		i1.add(100, 200);

	}

}
