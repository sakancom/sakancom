package sakancom;

import java.util.logging.*;

public class LoggerUtility {
    private static Logger logger;

    // Private constructor to prevent instantiation
    private LoggerUtility() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = Logger.getLogger(LoggerUtility.class.getName());
            setupLogger();
        }
        return logger;
    }

    private static void setupLogger() {
        logger.setUseParentHandlers(false);

        // Set a custom format for SimpleFormatter without timestamp
        SimpleFormatter simpleFormatter = new SimpleFormatter() {
            @Override
            public synchronized String format(LogRecord logRecord) {
                return logRecord.getMessage() ;
            }
        };

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);
    }
}
