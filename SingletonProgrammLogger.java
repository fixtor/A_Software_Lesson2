package homework;

public class SingletonProgrammLogger {

    private static SingletonProgrammLogger singletonProgrammLogger;
    public static String logFile = "This is lofFile\n";

    public static SingletonProgrammLogger getSingletonProgrammLogger() {
        if(singletonProgrammLogger == null){
            singletonProgrammLogger = new SingletonProgrammLogger();
        }
        return singletonProgrammLogger;
    }

    private SingletonProgrammLogger() {
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }

}
