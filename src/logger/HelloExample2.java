package logger;

import org.apache.log4j.Logger;

public class HelloExample2 {
	
	final static Logger logger = Logger.getLogger(HelloExample2.class);
	

	public static void main(String[] args) {
		
		logger.info("Entered Main method");
		logger.debug("Entered Main method debug");

	
		HelloExample2 obj = new HelloExample2();
		
		try {
			obj.divide();
		} catch (ArithmeticException e) {
		logger.error("Sorry , Something Wrong!" , e);
	
		}
		logger.debug("End Main method debug");
		logger.info("End Main method");
		
	
	}


	private void divide() {

		
		int i = 20/0;
		
	}
}
