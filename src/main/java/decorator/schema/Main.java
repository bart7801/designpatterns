package decorator.schema;

public class Main {

    public static void main(String[] args) {
        DecoratorInterface obj = new BaseClass();
        System.out.println(obj.getValue());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getValue());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getValue());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getValue());

        obj = new DecrementDecorator(obj);
        System.out.println(obj.getValue());
    }
}
