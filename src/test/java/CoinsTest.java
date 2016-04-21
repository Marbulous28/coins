import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CoinsTest {

  @Test
  public void calculateCoins_calculateQuarters_ArrayList() {
    Coins newCoins = new Coins();
    ArrayList<Integer> coinResult = newCoins.calculateCoins(25);
    Integer quarters = coinResult.get(0);
    Integer result = 1;
    assertEquals(result, quarters);
  }

  @Test
  public void calculateCoins_calculateDimes_ArrayList() {
    Coins newCoins = new Coins();
    ArrayList<Integer> coinResult = newCoins.calculateCoins(35);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(1);
    expected.add(0);
    expected.add(0);
    assertEquals(expected, coinResult);
  }

  @Test
  public void calculateCoins_calculateNickels_ArrayList() {
    Coins newCoins = new Coins();
    ArrayList<Integer> coinResult = newCoins.calculateCoins(40);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(1);
    expected.add(1);
    expected.add(0);
    assertEquals(expected, coinResult);
  }

  @Test
  public void calculateCoins_calculatePennies_ArrayList() {
    Coins newCoins = new Coins();
    ArrayList<Integer> coinResult = newCoins.calculateCoins(41);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(1);
    expected.add(1);
    expected.add(1);
    assertEquals(expected, coinResult);
  }

  @Test
  public void calculateCoins_calculateGOD_ArrayList() {
    Coins newCoins = new Coins();
    ArrayList<Integer> coinResult = newCoins.calculateCoins(457);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(18);
    expected.add(0);
    expected.add(1);
    expected.add(2);
    assertEquals(expected, coinResult);
  }
}
