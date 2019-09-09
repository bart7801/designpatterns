package decorator.decoratorexample;

public class ConsoleWriter {
  
  void println(String line) {
    System.out.println(line);
  }
  
  void println(StringBuilder sb) {
    System.out.println(sb.toString());
  }

}
