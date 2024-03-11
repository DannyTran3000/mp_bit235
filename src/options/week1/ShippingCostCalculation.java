package options.week1;

import java.util.Scanner;

import components.Shipping;

public class ShippingCostCalculation {
  public ShippingCostCalculation() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input the weight: ");
    int weight = sc.nextInt();

    System.out.println("Is is an international shipping? (Y/N)");
    String isInternational = sc.next();

    Shipping S = new Shipping();
    double finalFee = S.getShipping(weight, isInternational.equals("Y"));

    System.out.println("The final fee: " + finalFee);
  }
}
