package com.rockieyang.test;

import org.apache.log4j.Logger;

public class ContentAppender {
    Logger logger = Logger.getLogger("content");

    public void append(String msg) {
        logger.info(msg);
    }
}
