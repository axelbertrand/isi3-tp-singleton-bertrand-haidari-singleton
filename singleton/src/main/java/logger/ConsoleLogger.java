package logger;

import java.io.PrintStream;

public class ConsoleLogger implements Logger {

    private PrintStream printStream;


    public ConsoleLogger() {
        this.printStream = System.out;
    }

    private CharSequence prefixedAppend(CharSequence charSequence) {
        return String.format("%s : %s \n", toString(), LoggerUtil.coloredString(charSequence, LoggerUtil.Color.ANSI_RED ));
    }

    @Override
    public void log(CharSequence csq) {
        printStream.append(prefixedAppend(csq));
    }
}
