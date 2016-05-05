package com.rockiey.test.integration.junit;


import org.apache.log4j.Logger;
import org.junit.Test;

public class ITWeekly {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void smokeTest() {
		logger.debug("this is a weekly test");
	}
}
