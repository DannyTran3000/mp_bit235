import components.navigation.MainMenu;
import utils.Print;
import utils.Prompt;

public class App {
  public static void main(String[] args) throws Exception {
    MainMenu menu = new MainMenu();
    boolean shouldOpenMenu = true;

    while (shouldOpenMenu) {
      int TaskId = menu.init();
      shouldOpenMenu = menu.choose(TaskId);

      if (shouldOpenMenu) {
        Print.breakLines(3);
        Print.divideLine();

        String check = Prompt.nextLine("Would like to return to the main menu (y/n)?");

        if (!check.equals("y"))
          shouldOpenMenu = false;
      }
    }

    if (!shouldOpenMenu)
      System.exit(0);

    Prompt.close();
  }
}
