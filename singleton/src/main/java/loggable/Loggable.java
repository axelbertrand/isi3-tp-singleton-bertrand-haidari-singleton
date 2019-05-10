package loggable;

import logger.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Loggable {

    @Autowired
    private Logger logger;

    public void log() {
        logger.log(this);
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
