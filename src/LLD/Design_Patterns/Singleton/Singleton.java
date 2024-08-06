package LLD.Design_Patterns.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static  Singleton getInstance() {
        synchronized (Singleton.class){
            if (instance == null) {
                instance = new Singleton();
            }
        }

        return instance;
    }
}
