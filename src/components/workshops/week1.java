package components.workshops;

import utils.Prompt;

public class Week1 {
  public Week1() {
    int weight = Prompt.nextInt("Input the weight: ");
    String isInternational = Prompt.next("Is is an international shipping? (y/n)", 1);

    double finalFee = this.getShipping(weight, isInternational.equals("y"));

    System.out.println("The final fee: " + finalFee);
  }

  private double getShipping(int weight, boolean isInternational) {
    double fee = 12.95, shippingFee = fee;

    if (weight > 16)
      shippingFee = fee + ((weight - 16) * 0.3);

    if (isInternational)
      shippingFee = shippingFee + (weight * 10);

    return shippingFee;
  }
}
