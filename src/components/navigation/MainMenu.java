package components.navigation;

import components.workshops.Week_1;
import components.workshops.Week_2;
import components.workshops.Week_3;
import components.workshops.Week_4;
import utils.Print;
import utils.Prompt;

public class MainMenu {
  private static String[] list = {
      "Workshop 1: Shipping cost calculation",
      "Workshop 2: Primitive data types & string",
      "Workshop 3: Conditional logic & loops",
      "Workshop 4: Access modifier & array",
  };

  public static boolean choose(int id) {
    Print.breakLines(1);

    switch (id) {
      case 0:
        System.out.println("Good bye.");
        break;
      case 1:
        new Week_1();
        break;
      case 2:
        new Week_2();
        break;
      case 3:
        new Week_3();
        break;
      case 4:
        new Week_4();
        break;
      default:
        System.out.println("Warning: Option not found!");
    }

    return id != 0;
  }

  public static int init() {
    Print.breakLines(3);

    System.out.printf("%-54s\n", "------------------------------------------------------");
    System.out.printf("| %-19s %-10s %-19s |\n", "", "Main Menu", "");
    System.out.printf("%-54s\n", "------------------------------------------------------");

    for (int i = 0; i < list.length; i++)
      System.out.printf("| %-5s %-44s |\n", (i + 1) + ".", list[i]);

    System.out.printf("| %-50s |\n", "");
    System.out.printf("| %-5s %-44s |\n", "0.", "Exit");

    System.out.printf("%-50s\n", "------------------------------------------------------");

    Print.breakLines(3);

    return Prompt.nextIntInRange(
        "Enter your choice [0, " + list.length + "]: ",
        0,
        list.length);
  }
}
