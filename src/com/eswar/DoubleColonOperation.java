package com.eswar;

public class DoubleColonOperation {
	// With Double Colon Operation
	
	/*
	 * public static void m1() {
	 *  // with Static Method [ Class Name :: Method Name ]
	 * for (int i= 0; i<10; i++) { 
	 * System.out.println("Child Thread -1");
	 *  } 
	 *  }
	 */
	
	// With non-static Method
	
	 public  void m1() {
		 for (int i= 0; i<10; i++) { 
			 System.out.println("Child Thread -1");
		 } 
	 }
	

	public static void main(String[] args) {

		
		/*
		 * // With LambdaExpressions 
		 * Runnable r = ()-> { for (int i= 0; i<10; i++) {
		 * System.out.println("Child Thread"); } }; Thread t = new Thread(r); t.start();
		 * 
		 * for (int i= 0; i<10; i++) { System.out.println("Main Thread"); }
		 */
		
		
		
		
		/*
		 * // with Static Method [ Class Name :: Method Name ]
		 * 
		 * Runnable r = DoubleColonOperation :: m1;
		 * 
		 * Thread t = new Thread(r); t.start();
		 * 
		 * for (int i= 0; i<10; i++) { 
		 * System.out.println("Main Thread - 1"); 
		 * }
		 */
		
		// with non-static Method [ Objectreference :: Method Name ]
				 
		DoubleColonOperation dco = new DoubleColonOperation();
		
				 Runnable r = dco :: m1;
				 
				 Thread t = new Thread(r);
				 t.start();
				 
				 for (int i= 0; i<10; i++) { 
				 System.out.println("Main Thread - 1"); 
			}
		
	}

}
