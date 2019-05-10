package logger;

import loggable.Loggable;

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
        LogColor annotation = loggable.getClass().getAnnotation(LogColor.class);
        printStream.append(prefixedAppend(loggable.toString(), annotation.value()));
    }
}
