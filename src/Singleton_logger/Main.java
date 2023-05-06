package Singleton_logger;

public class Main {
    private static Logger logger= LoggerFactory.getLogger();
    public static void main(String[] args) {
        logger.error("this is an error msg");
        logger.info("this is an info  msg");
        logger.debug("this is an debug msg");
        logger.warning("this is an warning msg");
    }
}