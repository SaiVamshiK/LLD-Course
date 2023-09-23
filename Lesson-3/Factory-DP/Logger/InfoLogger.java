package Logger;

public class InfoLogger implements ILogger{

    public void log(String msg){
        System.out.println("Info Log : " + msg);
    }

}
