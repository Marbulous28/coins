import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputNumberString = request.queryParams("coinNumber");
      Integer inputNumber = Integer.parseInt(inputNumberString);

      Coins myCoins = new Coins();
      ArrayList<Integer> myResults = myCoins.calculateCoins(inputNumber);
      Integer myQuarters = myResults.get(0);
      Integer myDimes = myResults.get(1);
      Integer myNickels = myResults.get(2);
      Integer myPennies = myResults.get(3);

      String formattedString = String.format("That makes %d quarters, %d dimes, %d nickels, and %d pennies.", myQuarters, myDimes, myNickels, myPennies);
       model.put("stringResults", formattedString);
       return new ModelAndView(model, layout);
    },  new VelocityTemplateEngine());

  }

}
