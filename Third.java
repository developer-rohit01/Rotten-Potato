import java.util.Scanner;

public class Third {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
 /*There is the common problem while taking input
 from string after integer because of next line \n so
 we resolve it from using again a nextline method
  followed by scanner object scanner.nextLine();
  */
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your Favourite Colr: ");
        String color = scanner.nextLine();

        System.out.println("Your Age: "+age+"\nYour Favourite color: "+color);
        scanner.close();
    }
}
