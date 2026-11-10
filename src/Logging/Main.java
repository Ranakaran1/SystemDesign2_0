package Logging;

public class Main {
    public static void main(String[] args) {
        Logger logger = new DebugLogger(new InfoLogger(new ProdLogger(null)));
        logger.log(Logger.LOGG_LEVEL_PROD, "here is flag");
    }
}
