package homework;

public class ProgrammRunner {
    public static void main(String[] args) {
        SingletonProgrammLogger.getSingletonProgrammLogger().addLogInfo("Hellow new record");
        SingletonProgrammLogger.getSingletonProgrammLogger().addLogInfo("Hellow first record");
        SingletonProgrammLogger.getSingletonProgrammLogger().addLogInfo("Hellow second record");
        SingletonProgrammLogger.getSingletonProgrammLogger().showLogFile();
    }
}
