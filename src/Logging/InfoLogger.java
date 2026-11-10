package Logging;

public class InfoLogger extends Logger{
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase(LOGG_LEVEL_INFO)){
            System.out.println(LOGG_LEVEL_INFO + " Message : " + message);
        }else{
            super.checkNextLog(logLevel,message);
        }
    }
}
