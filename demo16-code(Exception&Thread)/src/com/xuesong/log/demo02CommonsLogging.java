package com.xuesong.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class demo02CommonsLogging {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("demo01log");
        log.info("start");
        log.warn("end");
    }
}
