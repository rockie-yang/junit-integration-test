package com.rockieyang.test.integration.junit;


import org.apache.log4j.Logger;
import org.junit.Test;

public class ITNightly {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void smokeTest() {
		logger.debug("this is a nightly test");
	}
}
