package com.rockiey.test.integration.unittest;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestUnit2 {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void unit2() {
		logger.debug("unit2");
		System.out.println("unit test 2");
	}
}
