package components;

public class Shipping {
  public double getShipping(int weight, boolean isInternational) {
    double fee = 12.95, shippingFee = fee;

    if (weight > 16) {
      shippingFee = fee + ((weight - 16) * 0.3);
      System.out.println("test: " + isInternational);
    }

    if (isInternational) {
      shippingFee = shippingFee + (weight * 10);
    }

    return shippingFee;
  }
}
