package decorator.decoratorexample.pizza;

public enum Ingredient {
  
  HAM("ham"),
  SAUCE("sauce"),
  MUSHROOMS("mushrooms"),
  CHEESE("cheese"),
  OLIVES("olives"),
  BASIL("basil");

  String value;

  Ingredient(String value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
  
}
