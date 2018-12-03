import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogzioLogbackExample {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogzioLogbackExample.class);

        logger.info("Small project for testing that logs are shipped to logz.io");
        logger.warn("Winter is coming, december 6!");
    }
}