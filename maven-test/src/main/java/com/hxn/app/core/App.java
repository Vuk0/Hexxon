package com.hxn.app.core;

import org.apache.log4j.Logger;

public class App 
{
	private static final Logger  logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "maven-test:" );
        System.out.println("Log4j ...");
        for(int i=1 ; i<10; i++) {
            System.out.println("Counter = " + i);
              logger.debug("App message with DEBUG level");
              logger.info("App message with INFO level ");
              logger.warn("App message with WARN level ");
              logger.error("App message with ERROR level ");
              logger.fatal("App message with FATAL level ");
        }
    }
}
