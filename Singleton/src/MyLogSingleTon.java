import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

public class MyLogSingleTon {


    private static MyLogSingleTon INSTANCE;
    public enum LogLevel {
        WARNING(1),INFORMATIOIN(2),ERROR(3);

        public int level;
        LevelEnum(int valor) {
            level = valor;
        }
    }

    private MyLogSingleTon(){

    }

    public static MyLogSingleTon getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new MyLogSingleTon();
        }
        return INSTANCE;
    }

    public void Log(String texto, LogLevel level){
        switch (LogLevel level){
            case (WAR)

    }

    public void setPriority(){

    }

}
