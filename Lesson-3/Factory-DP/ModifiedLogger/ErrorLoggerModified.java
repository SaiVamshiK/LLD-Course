package ModifiedLogger;

public class ErrorLoggerModified implements ILoggerModified{

    public void log(String msg){
        System.out.println("Error Log : " + msg);
    }

}
