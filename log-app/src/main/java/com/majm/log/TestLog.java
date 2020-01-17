package com.majm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2020/1/16 2:35 下午
 * @since
 */
public class TestLog {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestLog.class);
        logger.info("hello world");
    }
}
