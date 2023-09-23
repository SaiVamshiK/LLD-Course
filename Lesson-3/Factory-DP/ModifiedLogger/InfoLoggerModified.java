package ModifiedLogger;

public class InfoLoggerModified implements ILoggerModified{

    public void log(String msg){
        System.out.println("Info Log : " + msg);
    }

}
