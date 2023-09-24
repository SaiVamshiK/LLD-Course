
interface InfoLogger {
    public void log(String msg);
}

interface ErrorLogger {
    public void log(String msg);
}

interface DebugLogger {
    public void log(String msg);
}

class FileInfoLogger implements InfoLogger{

    @Override
    public void log(String msg) {
        System.out.println("File Info Log : " + msg);
    }
}

class ConsoleInfoLogger implements InfoLogger{

    @Override
    public void log(String msg) {
        System.out.println("Console Info Log : " + msg);
    }
}

class FileErrorLogger implements ErrorLogger{

    @Override
    public void log(String msg) {
        System.out.println("File Error Log : " + msg);
    }
}

class ConsoleErrorLogger implements ErrorLogger{

    @Override
    public void log(String msg) {
        System.out.println("Console Error Log : " + msg);
    }
}

class FileDebugLogger implements DebugLogger{

    @Override
    public void log(String msg) {
        System.out.println("File Debug Log : " + msg);
    }
}

class ConsoleDebugLogger implements DebugLogger{

    @Override
    public void log(String msg) {
        System.out.println("Console Debug Log : " + msg);
    }
}

interface LoggerFactory{

    public InfoLogger createInfoLogger();
    public DebugLogger createDebugLogger();
    public ErrorLogger createErrorLogger();

}

class FileLoggerFactory implements LoggerFactory{

    @Override
    public InfoLogger createInfoLogger() {
        return new FileInfoLogger();
    }

    @Override
    public DebugLogger createDebugLogger() {
        return new FileDebugLogger();
    }

    @Override
    public ErrorLogger createErrorLogger() {
        return new FileErrorLogger();
    }
}

class ConsoleLoggerFactory implements LoggerFactory{

    @Override
    public InfoLogger createInfoLogger() {
        return new ConsoleInfoLogger();
    }

    @Override
    public DebugLogger createDebugLogger() {
        return new ConsoleDebugLogger();
    }

    @Override
    public ErrorLogger createErrorLogger() {
        return new ConsoleErrorLogger();
    }
}

public class Main {

    public static void main(String[] args){
        LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        InfoLogger logger = loggerFactory.createInfoLogger();
        logger.log("Aegis response recieved");
    }

}
