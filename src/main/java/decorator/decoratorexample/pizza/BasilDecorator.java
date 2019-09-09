package decorator.decoratorexample.pizza;

import java.util.List;

public class BasilDecorator extends CapricciosaDecorator {

  public BasilDecorator(Pizza pizza) {
    super(pizza);
  }
  
  @Override
  public List<Ingredient> getIngredientsList() {
    return getIngredientsListWithExtraIngredient(super.getIngredientsList(), Ingredient.BASIL);
  }
  
}
