package components.caseStudies;

public class PictureFrame {
  final double wide = 1;

  String type, color = "white";
  int crownNumber = 0;
  double length, width;

  public PictureFrame(String type, String color, int crownNumber, double length, double width) {
    this.type = type;
    this.color = color;
    this.crownNumber = crownNumber;
    this.length = length;
    this.width = width;
  }

  private double calculateSize() {
    return this.wide * 2 * (this.length + this.width);
  }

  private double calculateColorCost() {
    final double cost = this.color != "white" ? 0.1 : 0;
    return cost * this.calculateSize();
  }

  private double calculateSizeCost() {
    double cost = this.type.equals("fancy") ? 0.25 : 0.15;
    return cost * this.calculateSize();
  }

  private double calculateCrownsCost() {
    final double cost = 0.35;
    return cost * crownNumber;
  }

  public double calculateCost() {
    return this.calculateColorCost() + this.calculateSizeCost() + this.calculateCrownsCost();
  }
}
