import java.util.Scanner;

import utils.Print;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Menu menu = new Menu();
    boolean shouldOpenMenu = true;

    while (shouldOpenMenu) {
      int TaskId = menu.init();
      shouldOpenMenu = menu.choose(TaskId);

      if (shouldOpenMenu) {
        Print.breakLines(3);
        Print.divideLine();
        System.out.print("Would like to return to the main menu (Y/N)?");
        String check = sc.nextLine();

        if (!check.equals("Y"))
          shouldOpenMenu = false;
      }
    }

    if (!shouldOpenMenu)
      System.exit(0);
  }
}
