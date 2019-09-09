package decorator.decoratorexample.pizza;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OlivesDecorator extends CapricciosaDecorator {

  public OlivesDecorator(Pizza pizza) {
    super(pizza);
  }
  
  @Override
  public List<Ingredient> getIngredientsList() {
    List<Ingredient> newIngredientsList = new LinkedList<>(super.getIngredientsList());
    newIngredientsList.add(Ingredient.OLIVES);
    return Collections.unmodifiableList(newIngredientsList);
  }
  
  @Override
  public float getPrice() {
    return super.getPrice() + 1.5f;
  }
  
}
