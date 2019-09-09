package singleton.singleton_zad;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public LazySingleton() {
        // database connection
    }
}