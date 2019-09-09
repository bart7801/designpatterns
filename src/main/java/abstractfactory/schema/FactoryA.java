package abstractfactory.schema;

public class FactoryA implements AbstractFactory {

    public AbstractClass create() {
        return new ClassA();
    }
}
