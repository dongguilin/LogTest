package com.guilin.log;


public class TestLog {

    public static void main(String[] args) {

        org.apache.log4j.Logger log4jLogger = org.apache.log4j.LogManager.getLogger(TestLog.class);
        log4jLogger.info("This is log4j1 Logger");

        org.apache.logging.log4j.Logger log4j2Logger = org.apache.logging.log4j.LogManager.getLogger(TestLog.class);
        log4j2Logger.info("This is log4j2 Logger");

        org.apache.commons.logging.Log commonsLogger = org.apache.commons.logging.LogFactory.getLog(TestLog.class);
        commonsLogger.info("This is commons Logger");

        // 推荐
        org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger(TestLog.class);
        slf4jLogger.info("This is slf4j Logger");

        java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger("TestLog");
        javaLogger.info("This is java Logger");

    }
}
