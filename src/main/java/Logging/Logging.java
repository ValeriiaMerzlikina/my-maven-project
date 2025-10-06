package Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

    static Logger logger = LogManager.getLogger();


    private void privateMethod() {
        System.out.println("Private method called");
        logger.info("Private method called");
    }


    public void publicMethod() {
        System.out.println("Public method called");
        logger.info("Public method called");

        privateMethod();
    }
}
