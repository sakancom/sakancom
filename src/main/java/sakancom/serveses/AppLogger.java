package sakancom.serveses;

import sakancom.LoggerUtility;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;


public class AppLogger {
    private static final Logger logger = LoggerUtility.getLogger();

    private AppLogger() {
        throw new IllegalStateException("Utility class");
    }


    public static void setLevel(Logger logger)
    {
        setlevelLogger(logger);
    }
    private static void setlevelLogger(Logger logger) {
        logger.setLevel(Level.INFO);
    }

}

