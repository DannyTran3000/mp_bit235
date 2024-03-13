package components.caseStudies;

public class Shipping {
  final static double initFee = 12.95;

  public static double getFee(int weight, boolean isInternational) {
    double shippingFee = initFee;

    if (weight > 16)
      shippingFee = initFee + ((weight - 16) * 0.3);

    if (isInternational)
      shippingFee = shippingFee + (weight * 10);

    return shippingFee;
  }
}
