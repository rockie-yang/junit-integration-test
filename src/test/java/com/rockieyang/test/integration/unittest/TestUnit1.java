package com.rockieyang.test.integration.unittest;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestUnit1 {
    Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void testUnit1Success() {
        logger.debug("testUnit1Success");
//        System.out.println("testUnit1Success");
    }


    @Test
    public void testUnit1Fail() throws Exception {
        logger.debug("testUnit1Fail");
//        System.out.println("testUnit1Fail");
//        org.junit.Assert.assertFalse("it will fail on purpose", true);
    }

    @Test
    public void testUnit1Delay() throws Exception {
        Thread.sleep(5000);
        logger.debug("testUnit1Fail");
//        System.out.println("testUnit1Fail");
//        org.junit.Assert.assertFalse("it will fail on purpose", true);
    }


}
