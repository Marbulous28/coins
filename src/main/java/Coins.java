import java.util.ArrayList;

public class Coins {
  public static void main(String[] args) {
  }

  public ArrayList<Integer> calculateCoins(Integer cents){
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nickels = 0;
    Integer pennies = 0;

    ArrayList<Integer> coinsArray = new ArrayList<Integer>();
    while(cents >= 25){
      quarters += 1;
      cents -= 25;
    }
    coinsArray.add(quarters);

    while (cents >= 10){
      dimes += 1;
      cents -= 10;
    }
    coinsArray.add(dimes);

    while (cents >= 5){
      nickels += 1;
      cents -= 5;
    }
    coinsArray.add(nickels);

    while (cents >= 1){
      pennies += 1;
      cents -= 1;
    }
    coinsArray.add(pennies);

    return(coinsArray);
  }
}
