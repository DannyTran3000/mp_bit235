import components.navigation.MainMenu;
import utils.Constant;
import utils.Print;
import utils.Prompt;

public class App {
  public static void main(String[] args) throws Exception {
    boolean shouldOpenMenu = true;

    while (shouldOpenMenu) {
      int TaskId = MainMenu.init();
      shouldOpenMenu = MainMenu.choose(TaskId);

      if (shouldOpenMenu) {
        Print.breakLines(3);

        String msg = "Would like to return to the Main Menu (y/n)?";
        Print.divideLine(msg.length());
        String check = Prompt.nextOption(msg, Constant.binaryOpts);

        if (!check.equals("y")) {
          shouldOpenMenu = false;
          MainMenu.choose(0);
        }
      }
    }

    if (!shouldOpenMenu)
      System.exit(0);

    Prompt.close();
  }
}
