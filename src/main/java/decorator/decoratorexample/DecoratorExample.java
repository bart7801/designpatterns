package decorator.decoratorexample;

import decorator.decoratorexample.pizza.*;

public class DecoratorExample {
  
  public static void main(String[] args) {
    App app = new App(new ConsoleWriter());
    app.start();
  }

}
