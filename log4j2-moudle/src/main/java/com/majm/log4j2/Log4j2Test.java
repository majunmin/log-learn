package com.majm.log4j2;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2020/1/16 2:12 下午
 * @since
 */
public class Log4j2Test {


//    public static Logger logger = LogManager.getLogger(Log4j2Test.class);
    public static Logger logger = LoggerFactory.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        logger.info("hello world");
    }
}
