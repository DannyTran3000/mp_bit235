package components.workshops;

import components.caseStudies.Shipping;
import utils.Constant;
import utils.Prompt;

public class Week1 {
  public Week1() {
    int weight = Prompt.nextInt("Input the weight: ");

    String isInternational = Prompt.nextOption(
        "Is is an international shipping (y/n)?",
        Constant.binaryOpts,
        1);

    double shippingFee = Shipping.getFee(weight, isInternational.equals("y"));

    System.out.println("The final fee: " + shippingFee);
  }
}
