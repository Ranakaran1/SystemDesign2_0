package Logging;

public class DebugLogger extends Logger{
    public DebugLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase(LOGG_LEVEL_DEBUG)){
            System.out.println(LOGG_LEVEL_DEBUG + " Message : " + message);
        }else{
            super.checkNextLog(logLevel,message);
        }
    }
}
