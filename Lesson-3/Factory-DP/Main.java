import Logger.ILogger;
import Logger.LoggerFactory;
import Logger.LoggerType;

public class Main {
    public static void main(String[] args){

        ILogger errorLog = LoggerFactory.createLogger(LoggerType.ERROR);
        errorLog.log("Some issue has happened");

    }
}
