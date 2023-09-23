package ModifiedLogger;

public class ErrorLoggerFactory implements ILoggerFactory{

    public ILoggerModified createLogger() {
        return new ErrorLoggerModified();
    }

}
