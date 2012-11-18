package com.hxn.app.core;

import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;
import org.apache.log4j.Logger;

/**
 * Author: Tomasz Banas
 * Application: Disc Space information
 */


public class App 
{
    public static void main( String[] args )
    {
    	final Logger logger = Logger.getLogger(App.class);
		logger.info("App message with INFO level");
		
		try {

			// calculate free disk space
			double freeDiskSpaceFirst = FileSystemUtils.freeSpaceKb("C:");
			double freeDiskSpaceSecond = FileSystemUtils.freeSpaceKb("D:");
			// convert the number into gigabyte
			double freeDiskSpaceFirstGB = freeDiskSpaceFirst / 1024 / 1024;
			double freeDiskSpaceSecondGB = freeDiskSpaceSecond /1024 /1014;

			System.out.println("Free Disk Space (GB) C: - " + freeDiskSpaceFirstGB);
			System.out.println("Free Disk Space (GB) D: - " + freeDiskSpaceSecondGB);
			
			logger.info("C: -" + freeDiskSpaceFirstGB);
			logger.info("D: - " + freeDiskSpaceSecondGB);
			
		} catch (IOException e) {
			logger.error("Error", e);
		}
    }
}
