import java.util.Random;

public class Randomcoin {
  public static void main(String[] args) {
    Random random = new Random();
    int number;
    double Num;
    boolean coin;
    coin=random.nextBoolean();
    Num=random.nextDouble(1.0, 5.0);
    number = random.nextInt(1, 7);

    System.out.println("Random Number: "+number);
    System.out.println("Random Double: "+Num);

    if(coin){
      System.out.println("HEADS");
    }else{
      System.out.println("TAILS");
    }
  }
}
