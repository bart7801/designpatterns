package decorator.meal_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseSet implements MealSet {

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public Set<MealPart> getParts() {
        Set<MealPart> parts = new HashSet<>();
        parts.add(MealPart.SMALL_DRINK);
        parts.add(MealPart.SMALL_FRIES);
        parts.add(MealPart.BIG_MAC);
        return parts;
    }
}
