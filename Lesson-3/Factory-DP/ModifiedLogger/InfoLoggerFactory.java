package ModifiedLogger;

public class InfoLoggerFactory implements ILoggerFactory{

    public ILoggerModified createLogger(){
        return new InfoLoggerModified();
    }

}
