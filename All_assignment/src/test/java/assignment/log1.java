package assignment;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log1 {

	static final Logger logger1=Logger.getLogger(log1.class);



	public static void main(String[] args) {

	//BasicConfigurator.configure();
		
	
	PropertyConfigurator.configure("src//test//java//assignment//log4j.properties");
		
	//PropertyConfigurator.configure("log4j.properties");
	logger1.debug("Example for debug msg");
	logger1.info("Example for info msg");
	logger1.warn("Example for warn msg");
	logger1.error("Example for error msg");
	logger1.fatal("Example for fatal msg");
}
}