package Logging;

public abstract class Logger {
    public static String LOGG_LEVEL_INFO = "INFO";
    public static String LOGG_LEVEL_DEBUG = "DEBUG";
    public static String LOGG_LEVEL_PROD = "PROD";

    Logger logger;

    public Logger(Logger logger) {
        this.logger = logger;
    }
    public void  checkNextLog(String logLevel, String message){
        if(logger!=null){
            logger.log(logLevel, message);
        }else{
            System.out.println("Not appropiate Logger!!!");
        }
    }
    public abstract void log(String logLevel, String message);
}
