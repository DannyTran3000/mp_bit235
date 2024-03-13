package components.workshops;

import utils.Print;
import utils.Prompt;

public class Week3 {
  public Week3() {
    this.doExercise1();
  }

  private void doExercise1() {
    System.out.println("Exercise 1:");

    Print.breakLines(1);

    // 1a
    System.out.println("a. \"Good day\" or \"Good evening\"");

    int n = Prompt.nextInt("Enter a number [1, 24]: ");
    System.out.println(n < 18 ? "Good day" : "Good evening");

    Print.breakLines(2);

    // 1b
    System.out.print("b. The loop of multiples of 5 in [10, 95]: ");

    String loopString = "";
    int gap = 10;
    while (gap <= 95) {
      if (gap > 10)
        loopString += ", ";

      loopString += gap;
      gap += 5;
    }
    System.out.println(loopString);

    Print.breakLines(2);

    // 1c
    System.out.print("c. The sum of integers in [1, 10]: ");

    int sum = 0;
    for (int i = 1; i <= 10; i++)
      sum += i;

    System.out.println(sum);
  }
}
