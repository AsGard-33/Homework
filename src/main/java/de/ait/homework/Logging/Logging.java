package de.ait.homework.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    private static final Logger logger = LogManager.getLogger(Logging.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

    }
}
