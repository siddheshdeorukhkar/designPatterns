package Singleton_logger;
//logger implementation
public class ConsoleLogger implements Logger{
    //this is eager initialization
    private static final Logger instance = new ConsoleLogger();

    private ConsoleLogger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    @Override
    public void info(String message) {
        System.out.println("[INFO]"+ message);
    }

    @Override
    public void debug(String message) {
        System.out.println("[DEBUG]"+ message);
    }

    @Override
    public void warning(String message) {
        System.out.println("[WARNING]"+ message);
    }

    @Override
    public void error(String message) {
        System.out.println("[ERROR]"+ message);
    }

}
