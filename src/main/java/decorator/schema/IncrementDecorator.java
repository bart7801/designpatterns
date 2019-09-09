package decorator.schema;

public class IncrementDecorator implements DecoratorInterface {

    private DecoratorInterface currentDecoratedObject;

    public IncrementDecorator(DecoratorInterface currentDecoratedObject) {
        this.currentDecoratedObject = currentDecoratedObject;
    }

    @Override
    public int getValue() {
        return currentDecoratedObject.getValue() + 1;
    }
}
