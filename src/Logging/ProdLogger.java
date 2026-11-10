package Logging;

public class ProdLogger extends Logger{
    public ProdLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase(LOGG_LEVEL_PROD)){
            System.out.println(LOGG_LEVEL_PROD + " Message : " + message);
        }else{
            super.checkNextLog(logLevel,message);
        }
    }
}
