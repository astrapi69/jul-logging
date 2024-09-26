package jul.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        System.setProperty("java.util.logging.config.file",
                ClassLoader.getSystemResource("logging.properties").getPath());
        LOGGER.log(Level.INFO, "This is a test info message.");
        LOGGER.warning("This is a test warning message.");
    }
}
