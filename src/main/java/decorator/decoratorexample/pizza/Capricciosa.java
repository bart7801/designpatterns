package decorator.decoratorexample.pizza;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Capricciosa implements Pizza {
  
  private List<Ingredient> ingredients;
  
  public Capricciosa() {
    this.ingredients = new LinkedList<>();
    ingredients.add(Ingredient.SAUCE);
    ingredients.add(Ingredient.CHEESE);
    ingredients.add(Ingredient.HAM);
    ingredients.add(Ingredient.MUSHROOMS);
  }

  public float getPrice() {
    return ingredients.size() * 3.8f;
  }

  public List<Ingredient> getIngredientsList() {
    return Collections.unmodifiableList(ingredients);
  }
}
