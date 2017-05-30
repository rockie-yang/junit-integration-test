package com.rockieyang.test.integration.junit;


import org.apache.log4j.Logger;
import org.junit.Test;

public class ITSmoke {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void smokeTest() {
		logger.debug("this is a smoke test");
	}
}
