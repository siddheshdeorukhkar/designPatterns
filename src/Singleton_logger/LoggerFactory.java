package Singleton_logger;

public class LoggerFactory {
    public static Logger getLogger(){
        return ConsoleLogger.getInstance();
    }
}
