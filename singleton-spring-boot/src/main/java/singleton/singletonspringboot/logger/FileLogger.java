package singleton.singletonspringboot.logger;

import singleton.singletonspringboot.loggable.Loggable;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Very very dumb file logger, do not copy this logger in your project.
 */
public class FileLogger implements Logger {
    @Override
    public void log(Loggable loggable) {
        try {
            FileWriter fileWriter = new FileWriter("tmp.txt", true);
            fileWriter.write(loggable + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
