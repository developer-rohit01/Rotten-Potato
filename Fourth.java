import java.util.Scanner;

public class Fourth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double width = 0;
    double height = 0;
    double area = 0;

    System.out.print("Enter the widht of the rectangle: ");
    width=scanner.nextDouble();

    System.out.print("Enter the height of the rectangle: ");
    height=scanner.nextDouble();

    area = width * height;
    System.out.println("The area of the rectangle is: " + area+ "cm²");

    scanner.close();
  }
  
}
