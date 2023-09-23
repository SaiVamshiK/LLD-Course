package ModifiedLogger;

public class DebugLoggerModified implements ILoggerModified{

    public void log(String msg){
        System.out.println("Debug Log : " + msg);
    }

}
