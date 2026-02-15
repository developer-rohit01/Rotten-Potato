import java.util.Scanner;
public class ComInt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble() /100;

        System.out.print("Enter the # times  compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the # of Years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate /timesCompounded, years * timesCompounded);

        System.out.printf("The amount after %d years is $%.2f",years,amount);
        sc.close();
    }
}
