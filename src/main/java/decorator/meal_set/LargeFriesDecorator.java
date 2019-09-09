package decorator.meal_set;

import java.util.Set;

public class LargeFriesDecorator implements MealSet {

    private MealSet mealSet;

    public LargeFriesDecorator(MealSet mealSet) {
        this.mealSet = mealSet;
    }

    @Override
    public double getPrice() {
        if (mealSet.getParts().contains(MealPart.LARGE_FRIES)){
            return mealSet.getPrice();
        }
        return mealSet.getPrice() + 2;
    }

    @Override
    public Set<MealPart> getParts() {
        Set<MealPart> parts = mealSet.getParts();
        parts.add(MealPart.LARGE_FRIES);
        parts.remove(MealPart.SMALL_FRIES);
        parts.remove(MealPart.SALAD);
        return parts;
    }
}