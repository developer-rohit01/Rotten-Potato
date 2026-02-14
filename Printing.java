
public class Printing {
  public static void main(String[] args) {
    int age = 21;
    String name = "Rohit Rajbhar";
    double marks = -85962452808.5;

    // + = output a plus
    //   , = comma grouping separator
    // (   = negative numbers are enclosed in ()
    // space = display a minus if negative, space if possible
    System.out.printf("Hello, My name is %s and I am %d years old. I scored \n% .2f marks in the exam.", name, age, marks);
  }
}
