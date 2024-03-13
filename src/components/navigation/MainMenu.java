package components.navigation;

import components.workshops.Week2;
import components.workshops.Week3;
import components.workshops.Week1;
import utils.Print;
import utils.Prompt;

public class MainMenu {
  private static String[] list = {
      "Workshop 1: Shipping cost calculation",
      "Workshop 2: Primitive data types & string",
      "Workshop 3: Conditional logic & loops",
  };

  public static boolean choose(int id) {
    Print.breakLines(1);

    switch (id) {
      case 0:
        System.out.println("Good bye.");
        break;
      case 1:
        new Week1();
        break;
      case 2:
        new Week2();
        break;
      case 3:
        new Week3();
        break;
      default:
        System.out.println("Warning: Option not found!");
    }

    return id != 0;
  }

  public static int init() {
    Print.breakLines(3);

    String heading = "===== ===== =====      MENU      ===== ===== =====";
    // Print heading
    System.out.println(heading);
    // Print menu list
    for (int i = 0; i < list.length; i++)
      System.out.println((i + 1) + ". " + list[i]);
    // Print exit option
    System.out.println("0. Exit");
    // Print divider
    Print.divideLine(heading.length());
    Print.breakLines(3);

    return Prompt.nextIntInRange(
        "Enter your choice (0 - " + list.length + "): ",
        0,
        list.length);
  }
}
