package com.majm.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logback log test </br>
 * logback 天然实现了 slf4j-api
 *
 * @author majunmin
 * @description
 * @datetime 2020/1/16 2:23 下午
 * @since
 */
public class LogbackTest {

    static Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args) {
        logger.info("hello world logback");
    }
}
