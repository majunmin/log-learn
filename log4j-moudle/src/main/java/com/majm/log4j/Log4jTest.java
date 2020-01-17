package com.majm.log4j;

//import org.apache.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2020/1/16 2:04 下午
 * @since
 */
public class Log4jTest {

//    public static Logger logger = Logger.getLogger(Log4jTest.class);
    static Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    public static void main(String[] args) {

        logger.info("hello world log4j");

    }
}
