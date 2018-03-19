package loggable;

import logger.ConsoleLogger;
import logger.Logger;

public abstract class Loggable {

    private Logger logger = new ConsoleLogger();

    public void log() {
        logger.log(toString());
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
