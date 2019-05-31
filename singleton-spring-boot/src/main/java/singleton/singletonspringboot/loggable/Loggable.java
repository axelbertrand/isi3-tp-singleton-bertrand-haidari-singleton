package singleton.singletonspringboot.loggable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import singleton.singletonspringboot.logger.Logger;

public abstract class Loggable {

    private static int counter = 0;

    @Autowired
    private Logger logger;

    public Loggable() {
        counter++;
    }

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
