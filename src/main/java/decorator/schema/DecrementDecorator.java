package decorator.schema;

public class DecrementDecorator implements DecoratorInterface {

    private DecoratorInterface currentDecoratedObject;

    public DecrementDecorator(DecoratorInterface currentDecoratedObject) {
        this.currentDecoratedObject = currentDecoratedObject;
    }

    @Override
    public int getValue() {
        return currentDecoratedObject.getValue() - 1;
    }
}
