import java.math.BigDecimal;
import java.util.Scanner;

public class Second {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your grade: ");
    char grade = scanner.next().charAt(0);

    System.out.print("Enter the Phone: ");
    BigDecimal phone = scanner.nextBigDecimal();

    System.out.print("Are you a student? (true/false): ");
    boolean student = scanner.nextBoolean();

    System.out.println("Printing Details \n");
    System.out.println("Your Name: "+ name + "\nYour Age: "+ age + "\nYour Grade: " +grade + "\nYour Price: " +phone + "\nStudent Check: "
     + (student ? "You are a Student" : "You are NOT a Student"));

     scanner.close();

   }
}
