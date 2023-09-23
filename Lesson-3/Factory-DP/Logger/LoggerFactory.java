package Logger;

public class LoggerFactory {

    public static ILogger createLogger(LoggerType loggerType){

        switch (loggerType){
            case INFO :
                return new InfoLogger();
            case DEBUG :
                return new DebugLogger();
            case ERROR :
                return new ErrorLogger();
            default :
                return null;
        }

    }

}
