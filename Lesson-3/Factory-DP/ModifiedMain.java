import ModifiedLogger.*;

public class ModifiedMain {

    public static void main(String[] args){

        ILoggerFactory loggerFactory = new DebugLoggerFactory();
        ILoggerModified logger = loggerFactory.createLogger();
        logger.log("Sending data to Aegis");

    }

}
