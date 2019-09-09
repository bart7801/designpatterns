package decorator.decoratorexample.pizza;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CapricciosaDecorator implements Pizza {
  
  private Pizza pizza;
  
  public CapricciosaDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public float getPrice() {
    return pizza.getPrice();
  }

  @Override
  public List<Ingredient> getIngredientsList() {
    return pizza.getIngredientsList();
  }
  
  protected List<Ingredient> getIngredientsListWithExtraIngredient(List<Ingredient> ingredients,
      Ingredient extraIngredient) {
    List<Ingredient> newIngredientsList = new LinkedList<>(ingredients);
    newIngredientsList.add(extraIngredient);
    return Collections.unmodifiableList(newIngredientsList);
  }
}
