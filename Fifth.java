import java.util.Scanner;
public class Fifth {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.print("Enter your Name: ");
        name=scanner.nextLine();

        System.out.print("Enter you Age: ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't Write your name.");
        }else{
            System.out.println("Hello "+name+" !");
        }

        if (age<18){
            System.out.println("You are not eligible to vote ");
        } else if (age<25){
            System.out.println("You are eligible to vote and Young too");
        }
        else {
            System.out.println("you are eligible to vote");
        }
        scanner.close();
    }
}
