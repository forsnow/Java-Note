package com.xuesong.log;

import java.util.logging.Logger;

public class demo01log {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process.");
        logger.warning("memery is running out.");
        logger.fine("ignore.");
        logger.severe("process will be terminated");


    }
}
