package singleton;

public class Sample {
    private static Sample ourInstance = new Sample();

    public static Sample getInstance() {
        return ourInstance;
    }

    private Sample() {
    }

    public void print(){
        System.out.println("simple singleton");
    }
}
