package abstractfactory.schema;

public class FactoryB implements AbstractFactory {

    public AbstractClass create() {
        return new ClassB();
    }
}

