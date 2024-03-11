import java.util.Scanner;

import options.week1.ShippingCostCalculation;
import options.week2.Workshop;
import utils.Print;

public class Menu {
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
        new ShippingCostCalculation();
        break;

      case 2:
        new Workshop();
        break;

      default:
        System.out.println("Option not found !!!");
    }

    return id != 0;
  }

  public int init() {
    Print pr = new Print();
    Scanner sc = new Scanner(System.in);

    pr.breakLines(3);
    System.out.println("===== ===== =====      MENU      ===== ===== =====");
    for (int i = 0; i < this.list.length; i++) {
      System.out.println((i + 1) + ". " + this.list[i]);
    }
    System.out.println("0. Exit");
    pr.divideLine();
    pr.breakLines(3);

    boolean notFound = false;
    int choice;

    do {
      System.out.print("Enter your choice (0 - " + this.list.length + "): ");
      choice = sc.nextInt();
      notFound = choice < 0 || choice > this.list.length;

      if (notFound)
        System.out.println("Option not found !!!");
    } while (notFound);

    return choice;
  }
}
