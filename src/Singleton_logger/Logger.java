package Singleton_logger;
// Logger Interface
public interface Logger {
    void info(String message);
    void debug(String message);
    void warning(String message);
    void error(String message);
}
