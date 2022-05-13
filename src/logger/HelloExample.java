package logger;

import org.apache.log4j.Logger;

public class HelloExample {

	final static Logger logger = Logger.getLogger(HelloExample.class);

	public static void main(String[] args) {

		HelloExample obj = new HelloExample();
		obj.runMe("Yogi");

	}

	private void runMe(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.debug("This is Debug : " + parameter);
		}
		if (logger.isInfoEnabled()) {
			logger.info("This is Info : " + parameter);
		}

		logger.warn("This is Warn : " + parameter);
		logger.error("This is Error : " + parameter);
		logger.fatal("This is Fatal : " + parameter);

	}

}
