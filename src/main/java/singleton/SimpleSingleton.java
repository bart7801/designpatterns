package singleton;

public class SimpleSingleton {

    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton(){
        //data initialization
        if (INSTANCE != null){
            throw new IllegalStateException();
        }
        System.out.println("constructor");
    }

    public void print(){
        System.out.println("simple singleton");
    }
}
