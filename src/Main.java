import dataClasses.in.InStructure;
import dataClasses.out.OutStructure;
import io.Formatter;
import io.Parser;

public class Main {
  public static void main(String[] args) {
    InStructure input = Parser.parser();
    OutStructure output = null; // algorithms.TODO(input);
    Formatter.formatter(output);
  }
}
