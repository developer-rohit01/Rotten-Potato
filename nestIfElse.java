public class nestIfElse {
    public static void main(String[]args){

        boolean isStudent = true;
        boolean isSenior =false;
        double ticketPrice = 9.99;

        if(isStudent) {
            if(isSenior){
                System.out.println("You are Senior student 30% discount applied!!");
                ticketPrice *= 0.7;
        }else{
                System.out.println("You are a student 10% Discount applied!!");
                ticketPrice *= 0.9;
            }
        }else {
            if (isSenior) {
                System.out.println("You are a Senior 20% discount applied!!");
                ticketPrice *= 0.8;
            } else {
                System.out.println("No discount applied!!");
                ticketPrice *= 1;
            }
        }
        System.out.printf("Ticket Price: $%.2f", ticketPrice);
    }
}
