package decorator.meal_set;

import java.util.Set;

public interface MealSet {
    double getPrice();
    Set<MealPart> getParts();
}
