package components.navigation;

import components.workshops.week2;
import components.workshops.week1;
import utils.Print;
import utils.Prompt;

public class MainMenu {
  private String[] list = {
      "Week 1: Shipping Cost Calculation",
      "Week 2: Workshop"
  };

  public boolean choose(int id) {
    switch (id) {
      case 0:
        System.out.println("Good bye !!!");
        break;

      case 1:
        new week1();
        break;

      case 2:
        new week2();
        break;

      default:
        System.out.println("Option not found !!!");
    }

    return id != 0;
  }

  public int init() {
    Print.breakLines(3);
    System.out.println("===== ===== =====      MENU      ===== ===== =====");
    for (int i = 0; i < this.list.length; i++) {
      System.out.println((i + 1) + ". " + this.list[i]);
    }
    System.out.println("0. Exit");
    Print.divideLine();
    Print.breakLines(3);

    boolean notFound = false;
    int choice;

    do {
      choice = Prompt.nextInt("Enter your choice (0 - " + this.list.length + "): ");
      notFound = choice < 0 || choice > this.list.length;

      if (notFound)
        System.out.println("Option not found !!!");
    } while (notFound);

    return choice;
  }
}
