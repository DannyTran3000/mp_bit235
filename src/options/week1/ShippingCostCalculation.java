package options.week1;

import components.Shipping;
import utils.Prompt;

public class ShippingCostCalculation {
  public ShippingCostCalculation() {
    int weight = Prompt.nextInt("Input the weight: ");

    String isInternational = Prompt.next("Is is an international shipping? (y/n)");

    Shipping S = new Shipping();
    double finalFee = S.getShipping(weight, isInternational.equals("y"));

    System.out.println("The final fee: " + finalFee);
  }
}
