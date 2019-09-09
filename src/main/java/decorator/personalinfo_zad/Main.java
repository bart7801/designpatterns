package decorator.personalinfo_zad;

public class Main {

    public static void main(String[] args) {
        PersonalInfo obj = new Person();
        System.out.println(obj.getPrintInfo());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getPrintInfo());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getPrintInfo());

        obj = new IncrementDecorator(obj);
        System.out.println(obj.getPrintInfo());

        obj = new DecrementDecorator(obj);
        System.out.println(obj.getPrintInfo());
    }
}
