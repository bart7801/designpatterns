package decorator.meal_set;

public class Main {

    public static void main(String[] args) {
        MealSet set = new BaseSet();

        set = new LargeFriesDecorator(set);
        set = new LargeFriesDecorator(set);
        set = new LargeFriesDecorator(set);
        set = new LargeFriesDecorator(set);
        set = new LargeFriesDecorator(set);
        set = new LargeFriesDecorator(set);

        System.out.println(set.getParts());
        System.out.println(set.getPrice());
    }
}
