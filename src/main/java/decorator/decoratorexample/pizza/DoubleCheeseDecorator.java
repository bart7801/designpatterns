package decorator.decoratorexample.pizza;

import java.util.List;

public class DoubleCheeseDecorator extends CapricciosaDecorator {

  public DoubleCheeseDecorator(Pizza pizza) {
    super(pizza);
  }
  
  @Override
  public List<Ingredient> getIngredientsList() {
    return getIngredientsListWithExtraIngredient(super.getIngredientsList(), Ingredient.CHEESE);
  }
  
  @Override
  public float getPrice() {
    return super.getPrice() + 2f;
  }
  
}
