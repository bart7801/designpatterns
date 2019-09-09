package decorator.decoratorexample;

import decorator.decoratorexample.pizza.*;

public class App {
  
  private ConsoleWriter consoleWriter;
  
  public App(ConsoleWriter consoleWriter) {
    this.consoleWriter = consoleWriter;
  }
  
  public void start() {

    Pizza pizza = new Capricciosa();

    pizza = new DoubleCheeseDecorator(pizza);

    pizza = new OlivesDecorator(pizza);

    pizza = new BasilDecorator(pizza);

    pizza.getIngredientsList();
  }
  
}
