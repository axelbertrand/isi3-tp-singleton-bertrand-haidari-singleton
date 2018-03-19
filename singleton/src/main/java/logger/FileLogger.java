package logger;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Very very dumb file logger, do not copy this logger in your project.
 */
public class FileLogger implements Logger {


    public FileLogger() {

    }

    @Override
    public void log(CharSequence message) {
        try {
            FileWriter fileWriter = new FileWriter("tmp.txt", true);
            fileWriter.write((String) message + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
