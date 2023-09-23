package ModifiedLogger;

public class DebugLoggerFactory implements ILoggerFactory{

    public ILoggerModified createLogger(){
        return new DebugLoggerModified();
    }

}
