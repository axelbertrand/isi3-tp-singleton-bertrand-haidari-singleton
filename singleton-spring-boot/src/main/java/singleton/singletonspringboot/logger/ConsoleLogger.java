package singleton.singletonspringboot.logger;

import singleton.singletonspringboot.loggable.Loggable;

import java.io.PrintStream;

public class ConsoleLogger implements Logger {

    private PrintStream printStream;


    public ConsoleLogger() {
        this.printStream = System.out;
    }

    private CharSequence prefixedAppend(CharSequence charSequence, LoggerUtil.Color color) {
        return String.format("%s : %s \n", toString(), LoggerUtil.coloredString(charSequence, color ));
    }

    @Override
    public void log(Loggable loggable) {
        LoggerUtil.Color color = LoggerUtil.Color.ANSI_RESET;
        if (loggable.getClass().isAnnotationPresent(LogColor.class)) {
            color = loggable.getClass().getAnnotation(LogColor.class).value();
        }
        printStream.append(prefixedAppend(loggable.toString(), color));
    }
}
