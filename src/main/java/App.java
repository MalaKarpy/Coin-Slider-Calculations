import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {}


  public static HashMap<String, Integer> changeCalculations(Integer inputCents){

    //System.out.println("please enter the change amount you want converted!");

    Integer inputChange = 93;

    Integer total = 0;

    Integer quarters = 0;
    Integer dimes = 0;
    Integer nickels = 0;
    Integer pennies = 0;


    while (inputChange > 0)
    {

      if (inputChange >= 25)
      {
        inputChange -= 25;
        quarters++;
      }

      else if (inputChange >= 10)
      {
        inputChange -= 10;
        dimes++;
      }

      else if (inputChange >= 5)
      {
        inputChange -= 5;
        nickels++;
      }

      else
      {
        pennies = inputChange;
        inputChange = 0;
      }
    }
      HashMap<String, Integer> changeReturn = new HashMap<String, Integer>();
      changeReturn.put("quarters", quarters);
      changeReturn.put("dimes", dimes);
      changeReturn.put("nickels", nickels);
      changeReturn.put("pennies", pennies);

      //String outputChange = String.format("%d quarters ,%d dimes,%d nickels,%d pennies", quarters, dimes, nickels, pennies);


      return changeReturn;
      }
}
    //   quarters = inputChange % 25;
    //   total = inputChange - (25*quarters);
    //   inputChange = total;
    //   }
    //
    // while (inputChange > 0) {
    //   dimes = inputChange %  10;
    //   total = inputChange - (10*dimes);
    //   inputChange = total;
    //   }
    //
    // while (inputChange > 0) {
    //   nickels = inputChange % 5;
    //   total = inputChange - (5*nickels);
    //   inputChange = total;
    //   }
    //
    // while (inputChange > 0) {
    //   pennies = inputChange % 1;
    //   total = inputChange - (1*pennies);
    //   inputChange = total;
    //   }
