package abstractfactory.schema;

public class Main {

    public static void main(String[] args) {
        // prepare
        AbstractFactory factory1 = new FactoryA();
        AbstractFactory factory2 = new FactoryB();
        // end

        AbstractClass obj1 = factory1.create();
        AbstractClass obj2 = factory2.create();

        obj1.method();
        obj2.method();
    }
}