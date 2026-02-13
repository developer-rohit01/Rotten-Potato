import java.util.Scanner;

public class Pizza {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    String Item;
    int quantity;
    double price;

    System.out.println("Welcome to our Pizza Shop!");
    System.out.print("Enter What would you like to oder: ");
    Item = scanner.nextLine();

    System.out.print("Enter the quantity: ");
    quantity = scanner.nextInt();

    System.out.print("Enter the price of the item: ");
    price = scanner.nextDouble();

    double totalCost = quantity * price;

    System.out.println("Your Oder: "+ quantity +" "+ Item + " at the Price of: $"+ price + "\nTotal Cost: $" + totalCost);  

    scanner.close();


  }
  
}
