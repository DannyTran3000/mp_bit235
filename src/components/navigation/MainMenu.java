package components.navigation;

import components.workshops.Week2;
import components.workshops.Week1;
import utils.Print;
import utils.Prompt;

public class MainMenu {
  private static String[] list = {
      "Week 1: Shipping Cost Calculation",
      "Week 2: Workshop"
  };

  public static boolean choose(int id) {
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
    for (int i = 0; i < list.length; i++) {
      System.out.println((i + 1) + ". " + list[i]);
    }
    // Print exit option
    System.out.println("0. Exit");
    // Print divider
    Print.divideLine(heading.length());
    Print.breakLines(3);

    boolean notFound = false;
    int choice;

    do {
      choice = Prompt.nextInt("Enter your choice (0 - " + list.length + "): ");
      notFound = choice < 0 || choice > list.length;

      if (notFound)
        System.out.println("Warning: Option not found!");
    } while (notFound);

    return choice;
  }
}
