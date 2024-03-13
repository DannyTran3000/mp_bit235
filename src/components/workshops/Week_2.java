package components.workshops;

import utils.Print;
import utils.Prompt;

public class Week_2 {
  private final double pi = 3.14,
      interestRate = 0.04,
      fuelConsumptionPerKm = 8.0 / 100,
      fuelConsumptionOnRoughRoad = 1.15 * fuelConsumptionPerKm;
  private final int sunDiameter = 865000, earthDiameter = 7600;
  private final String sampleText = "I love java programming";

  public Week_2() {
    this.getDifferenceOf2Numbers();
    Print.breakLines(2);

    this.getDegreesConversion();
    Print.breakLines(2);

    this.getCircleArea();
    Print.breakLines(2);

    this.getCompoundInterest();
    Print.breakLines(2);

    this.getSunAndEarthInfo();
    Print.breakLines(2);

    this.getCarDistance();
    Print.breakLines(2);

    this.getLengthOfSubString();
    Print.breakLines(2);

    this.getStringsComparison();
  }

  // Exercise 1
  private void getDifferenceOf2Numbers() {
    System.out.println("Exercise 1: The difference of two numbers");

    int a = Prompt.nextInt("Enter two numbers:", 0);
    int b = Prompt.nextInt("");

    System.out.println("The difference of " + a + " and " + b + " is: " + Math.abs(a - b));
  }

  // Exercise 2
  private void getDegreesConversion() {
    System.out.println("Exercise 2: Convert Celsius degrees to Fahrenheit degrees");

    float c = Prompt.nextFloat("Enter the Celsius degree: ");
    float f = c * 9 / 5 + 32;

    System.out.println("The Fahrenheit degrees: " + f);
  }

  // Exercise 3
  private void getCircleArea() {
    System.out.println("Exercise 3: Calculate the area of circle");

    float r = Prompt.nextFloat("Enter the radius of the circle(m): ");
    double a = this.pi * Math.pow(r, 2);

    System.out.println("The area of this circle: " + a + " m2");
  }

  // Exercise 4
  private void getCompoundInterest() {
    System.out.println("Exercise 4: Calculate the compound interest");

    double p = Prompt.nextDouble("How much do you invest in (AUD)? ");

    int year = Prompt.nextInt("How long is the period (years)? ");

    double compoundInterest = p * Math.pow(1 + this.interestRate, year);

    System.out.println("The compound interest of " + p + " AUD in " + year + " is: " + compoundInterest + " AUD");
  }

  // Exercise 5
  private void getSunAndEarthInfo() {
    System.out.println("Exercise 5: Calculate some figure of the Earth and the Sun");

    double ev = this.getPlanetVolume(this.earthDiameter / 2);
    System.out.println("The volume of the Earth in cubic miles: " + ev);

    double sv = this.getPlanetVolume(this.sunDiameter / 2);
    System.out.println("The volume of the Sun in cubic miles: " + sv);

    System.out.println("The ratio of the Sun to the volume of the Earth: " + (sv / ev));
  }

  private double getPlanetVolume(double r) {
    return 4.0 / 3.0 * this.pi * Math.pow(r, 3);
  }

  // Exercise 6
  private void getCarDistance() {
    System.out.println("Exercise 6: Calculate the distance that the car can travel with 40 liters");

    double distance = 40 / fuelConsumptionPerKm;
    double distanceOnRoughRoad = 40 / fuelConsumptionOnRoughRoad;

    System.out.println(fuelConsumptionPerKm);

    System.out.println("The distance that the car can travel with 40 liters of fuel is: " + distance + " km");
    System.out.println("The distance that the car can travel with 40 liters of fuel on the rough road is: "
        + distanceOnRoughRoad + " km");
  }

  // Exercise 7
  private void getLengthOfSubString() {
    System.out.println("Exercise 7: The length after substring of the text \"" + this.sampleText + "\"");
    String subStringText = this.sampleText.substring(7, 11);
    System.out.println("The text after substring: " + subStringText);
    System.out.println("The length of the substring text is: " + subStringText.length());
  }

  // Exercise 8
  private void getStringsComparison() {
    System.out.println("Exercise 8: Compare 2 strings and their first characters");
    Print.breakLines(1);

    String firstStr = Prompt.nextLine("First string: ");
    Print.breakLines(1);

    String secondStr = Prompt.nextLine("Second string: ");
    Print.breakLines(1);

    System.out.println(
        firstStr.equals(secondStr)
            ? "The two given strings are equal"
            : "The two given strings are not equal");
    Print.breakLines(1);

    System.out.println(
        firstStr.charAt(0) == secondStr.charAt(0)
            ? "The first character of two given strings are equal"
            : "The first character of two given strings are not equal");
  }
}
