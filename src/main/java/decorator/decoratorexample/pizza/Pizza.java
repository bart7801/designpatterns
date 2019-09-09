package decorator.decoratorexample.pizza;

import java.util.List;

public interface Pizza {
  
  float getPrice();
  
  List<Ingredient> getIngredientsList();

}
